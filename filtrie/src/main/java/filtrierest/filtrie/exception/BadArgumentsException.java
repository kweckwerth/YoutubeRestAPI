package filtrierest.filtrie.exception;


public class BadArgumentsException extends ServiceException {
    public BadArgumentsException() {
        super();
    }

    public BadArgumentsException(String message) {
        super(message);
    }

    public BadArgumentsException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadArgumentsException(Throwable cause) {
        super(cause);
    }
}
