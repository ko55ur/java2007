package course3.homework6.chat.server.error;

public class WrongCredentialsException extends IllegalArgumentException {
    public WrongCredentialsException() {
    }

    public WrongCredentialsException(String s) {
        super(s);
    }
}