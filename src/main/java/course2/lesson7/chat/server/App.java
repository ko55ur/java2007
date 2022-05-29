package course2.lesson7.chat.server;

import course2.lesson7.chat.server.service.impl.InMemoryUserServiceImpl;

public class App {
    public static void main(String[] args) {
        new Server(new InMemoryUserServiceImpl()).start();
    }
}
