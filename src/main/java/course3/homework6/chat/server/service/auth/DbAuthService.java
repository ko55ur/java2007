package course3.homework6.chat.server.service.auth;

import course3.homework6.chat.server.db.ClientsDbService;
import course3.homework6.chat.server.registry.User;


public class DbAuthService implements AuthService {


    private ClientsDbService dbService;

    @Override
    public void start() {
        dbService = ClientsDbService.getInstance();
    }

    @Override
    public void stop() {
        dbService.closeConnection();
    }

    @Override
    public String authorizeUserByLoginAndPassword(String login, String pass) {
        return dbService.getClientNameByLoginPass(login, pass);
    }

    @Override
    public String changeNick(String login, String newNick) {
        return dbService.changeNick(login, newNick);
    }

    @Override
    public void changePassword(String username, String oldPassword, String newPassword) {

    }

    @Override
    public void resetPassword(String login, String newPass, String secret) {

    }

    @Override
    public User createNewUser(String login, String password, String nickname) {
        return null;
    }

    @Override
    public void deleteUser(String login, String pass) {

    }
}

