package week13.dice;
import week13.exception.EnoughDiceException;

import java.util.Random;

public class Dice {
    private int side;
    private static final int MAX = 4;
    private static int number = 0;
    public Dice() throws EnoughDiceException {
        if (number == MAX) {
            throw new EnoughDiceException();
        }
    }
    public Dice(int side) throws EnoughDiceException{
        if (number == MAX) {
            throw new EnoughDiceException();
        }
        this.side = side;
        number++;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int generateRandom(int side)
    {
        int randomNumber;
        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(side,side + 24) % 6 + 1;
        return randomNumber;
    }
}
