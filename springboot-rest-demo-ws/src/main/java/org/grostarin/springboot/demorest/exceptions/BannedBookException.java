package org.grostarin.springboot.demorest.exceptions;

public class BannedBookException extends RuntimeException {

    public BannedBookException() {
        super("Livre interdit");
    }

    public BannedBookException(final String message, final Throwable cause) {
        super("Livre interdit: " + message, cause);
    }

    public BannedBookException(final String message) {
        super("Livre interdit: " + message);
    }

    public BannedBookException(final Throwable cause) {
        super("Livre interdit", cause);
    }
}
