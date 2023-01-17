package week13.exception;

public class EnoughPlayerException extends Exception {
    public EnoughPlayerException() {
        super("The number of players are already full, 4 players have been created!");
    }
}
