package course2.lesson8.chat.server.error;


public class NickAllreadyIsBusyException extends IllegalArgumentException {
    public NickAllreadyIsBusyException() {
    }

    public NickAllreadyIsBusyException(String s) {
        super(s);
    }
}