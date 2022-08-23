package course3.homework6.chat.server.db;

import course3.homework6.chat.server.error.ChangeNickException;
import course3.homework6.chat.server.error.WrongCredentialsException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

public class ClientsDbService {
    private static final String DRIVER = "org.sqlite.JDBC";
    private static final String CONNECTION = "jdbc:sqlite:/home/ko55ur/IdeaProjects/java2007/src/main/resources/db/test.db";
    private static final String GET_USERNAME = "select username from clients where login = ? and password = ?;";
    private static final String CHANGE_USERNAME = "update clients set username = ? where login = ?;";
    private static final String CREATE_DB = "create table if not exists clients (id integer primary key autoincrement," +
            " login text unique not null, password text not null, username text unique not null);";
    private static final String INIT_DB = "insert into clients (login, password, username) " +
            "values ('log1', 'pass1', 'user1'), ('log2', 'pass2', 'user2'), ('log3', 'pass3', 'user3');";
    private static ClientsDbService instance;
    private static final Logger logger = LogManager.getLogger(ClientsDbService.class.getName());

    private Connection connection;
    PreparedStatement getClientStatement;
    PreparedStatement changeNickStatement;

    public static ClientsDbService getInstance() {
        if (instance != null) return instance;
        instance = new ClientsDbService();
        return instance;
    }

    public String changeNick(String login, String newNick) {
        try (PreparedStatement psChangeNick = connection.prepareStatement(CHANGE_USERNAME)) {
            connect();
            psChangeNick.setString(1, newNick);
            psChangeNick.setString(2, login);
            if (psChangeNick.executeUpdate() > 0) return newNick;
            closeConnection();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        }
        throw new ChangeNickException("Something went wrong with nickname change");
    }

    public String getClientNameByLoginPass(String login, String pass) {
        try {
            connect();
            getClientStatement.setString(1, login);
            getClientStatement.setString(2, pass);
            ResultSet rs = getClientStatement.executeQuery();
            if (rs.next()) {
                String result = rs.getString("username");
                rs.close();
                System.out.printf("login is: %s\n", result);
                return result;
            }
            closeConnection();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        }
        throw new WrongCredentialsException("User not found");
    }

    private void createDb() {
        try (Statement st = connection.createStatement()) {
            connect();
            st.execute(CREATE_DB);
            st.execute(INIT_DB);
            closeConnection();
        } catch (ClassNotFoundException | SQLException throwable) {
            throwable.printStackTrace();

        }
    }

    private void connect() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        connection = DriverManager.getConnection(CONNECTION);
        logger.info("Connected to db!");
        getClientStatement = connection.prepareStatement(GET_USERNAME);
        changeNickStatement = connection.prepareStatement(CHANGE_USERNAME);
    }


    public void closeConnection() {
        try {
            if (getClientStatement != null) getClientStatement.close();
            if (changeNickStatement != null) changeNickStatement.close();
            if (connection != null) connection.close();
            logger.info("Disconnected from db!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
