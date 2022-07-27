package course3.chat.server.error;

public class ChangeNickExeption extends RuntimeException {

    public ChangeNickExeption(String message) {
        super(message);
    }
}
