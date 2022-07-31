package course3.chat.server.error;

public class ChangeNickException extends RuntimeException {

    public ChangeNickException(String message) {
        super(message);
    }
}
