package course3.homework6.chat.server.service;

import course3.homework6.chat.server.registry.User;

public interface UserService {
    void start();

    void stop();

    String authenticate(String login, String password);

    String changeNick(String oldNick, String newNick);

    User createUser(String login, String password, String nick);

    void deleteUser(String login, String password);

    void changePassword(String login, String oldPassword, String newPassword);
}