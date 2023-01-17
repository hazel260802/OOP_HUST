package week13.player;

import week13.dice.RollDice;
import week13.dice.Dice;
import week13.exception.EnoughPlayerException;
import week13.exception.InvalidPlayerNameException;

public class Player implements RollDice {
    private String name;
    private int score;
    private final int MAXSCORE = 21;
    private static final int MAXPLAYERS = 4;
    private static int NUM = 0;

    public Player() throws EnoughPlayerException {
        if (NUM == MAXPLAYERS) {
            throw new EnoughPlayerException();
        }
    }

    public Player(String name) throws EnoughPlayerException, InvalidPlayerNameException {
        if (NUM == MAXPLAYERS) {
            throw new EnoughPlayerException();
        }
        if (name.equals("")) {
            throw new InvalidPlayerNameException();
        }
        this.name = name;
        this.score = 0;
        NUM++;
    }
    public static int getNUM() {
        return NUM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        if (score==MAXSCORE){
            System.out.println(this.name + "'s score: " + score);
            System.out.println("Congratulation, " + this.name + " win this game.");
            return -1;
        }
        if (score>MAXSCORE) score = 0;
        System.out.println(this.name + "'s score: " + score);
        return score;
    }
    public int rollDice (Dice dice){
        int result = dice.generateRandom(dice.getSide());
        this.score += result;
        System.out.println(this.name + " rolled: " + result);
        return  result;
    }
    public static void clearPLayer() {
        NUM = 0;
    }

    public static void clearBot(int botNum) {
        NUM = 4 - botNum;
    }

}
