package enst.enset.exceptiond;

public class ClassLoaderException extends RuntimeException {
    public ClassLoaderException(String message) {
        super(message);
    }
    public ClassLoaderException(String message, Throwable cause) {
        super(message, cause);
    }
}
