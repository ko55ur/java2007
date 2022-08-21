package course3.homework6.chat.server;

import course3.homework6.chat.server.service.auth.DbAuthService;


public class App {
    public static void main(String[] args) {
        new Server(new DbAuthService()).start();
    }
}