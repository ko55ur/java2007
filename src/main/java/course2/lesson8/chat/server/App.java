package course2.lesson8.chat.server;

import course2.lesson8.chat.server.service.impl.InMemoryUserServiceImpl;

public class App {
    public static void main(String[] args) {
        new Server(new InMemoryUserServiceImpl()).start();
    }
}