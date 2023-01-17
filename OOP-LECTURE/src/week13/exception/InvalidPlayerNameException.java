package week13.exception;

public class InvalidPlayerNameException extends Exception {
    public InvalidPlayerNameException() {
        super("Player name is invalid!");
    }
}
