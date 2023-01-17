package week13.exception;

public class EnoughDiceException extends Exception {
    public EnoughDiceException() {
        super("The number of dices are already full, 4 dices have been created!");
    }
}
