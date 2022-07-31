package course3.chat.server.error;

public class WrongCredentialsException extends IllegalArgumentException {
    public WrongCredentialsException() {
    }

    public WrongCredentialsException(String s) {
        super(s);
    }
}