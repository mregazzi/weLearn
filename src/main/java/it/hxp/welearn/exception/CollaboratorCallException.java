package it.hxp.welearn.exception;

public class CollaboratorCallException extends RuntimeException {
    private static final long serialVersionUID = -1224041776706103672L;

    public CollaboratorCallException() {
        super();
    }

    public CollaboratorCallException(String message,
                                     Throwable cause) {
        super(message, cause);
    }

    public CollaboratorCallException(String message) {
        super(message);
    }

    public CollaboratorCallException(Throwable cause) {
        super(cause);
    }
}