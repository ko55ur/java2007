package course3.chat.server;

import course3.chat.common.props.PropertyReader;
import course3.chat.server.service.auth.AuthService;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Server {
    public static final String REGEX = "%!%";
    private final int port;
    private final AuthService authService;
    private final List<Handler> clientHandlers;
    private final ExecutorService executorService;

    public Server(AuthService authService) {
        port = PropertyReader.getInstance().getPort();
        this.clientHandlers = new ArrayList<>();
        this.authService = authService;
        this.executorService = Executors.newCachedThreadPool();
    }

    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server start!");
            authService.start();
            while (true) {
                System.out.println("Waiting for connection......");
                var socket = serverSocket.accept();
                System.out.println("Client connected");
                var clientHandler = new Handler(socket, this);
                clientHandler.handle();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            shutdown();
        }
    }

    public void privateMessage(String sender, String recipient, String message, Handler senderHandler) {
        var handler = getHandlerByUser(recipient);
        if (handler == null) {
            senderHandler.send(String.format("/error%s recipient not found: %s", REGEX, recipient));
            return;
        }
        message = String.format("[PRIVATE] [%s] -> [%s]: %s", sender, recipient, message);
        handler.send(message);
        senderHandler.send(message);
    }

    public void broadcastMessage(String from, String message) {
        message = String.format("[%s]: %s", from, message);
        for (Handler clientHandler : clientHandlers) {
            clientHandler.send(message);
        }
    }

    public synchronized void addAuthorizedClientToList(Handler clientHandler) {
        clientHandlers.add(clientHandler);
        sendOnlineClients();
    }

    public synchronized void removeAuthorizedClientFromList(Handler clientHandler) {
        clientHandlers.remove(clientHandler);
        sendOnlineClients();
    }

    public void sendOnlineClients() {
        var sb = new StringBuilder("/list");
        sb.append(REGEX);
        for (Handler clientHandler : clientHandlers) {
            sb.append(clientHandler.getUserNick());
            sb.append(REGEX);
        }
        var message = sb.toString();
        for (Handler clientHandler : clientHandlers) {
            clientHandler.send(message);
        }
    }

    public synchronized boolean isNickBusy(String nick) {
        for (Handler clientHandler : clientHandlers) {
            if (clientHandler.getUserNick().equals(nick)) {
                return true;
            }
        }
        return false;
    }

    private void shutdown() {
        authService.stop();
        executorService.shutdownNow();
    }

    public AuthService getAuthService() {
        return authService;
    }

    private Handler getHandlerByUser(String username) {
        for (Handler clientHandler : clientHandlers) {
            if (clientHandler.getUserNick().equals(username)) {
                return clientHandler;
            }
        }
        return null;
    }

    public ExecutorService getExecutorService() {
        return executorService;
    }
}
