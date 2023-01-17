package week13.player;

import week13.exception.InvalidPlayerNameException;
import week13.exception.EnoughPlayerException;

public class Bot extends Player implements LoserExpressEmotion {
    private static int id = 1;

    public Bot() throws EnoughPlayerException, InvalidPlayerNameException {
        super("Bot " + id);
        id++;
    }
    public static void clearBot() {
        id = 1;
    }
    @Override
    public void loserExpressEmotion() {
        if (this.getName().equals("Bot 1"))
            System.out.println("Bot 1 loses!");
        else if (this.getName().equals("Bot 2"))
            System.out.println("Bot 2 loses!");
        else if (this.getName().equals("Bot 3"))
            System.out.println("Bot 3 loses!");
        else System.out.println("Bot 4 loses!");

    }
}
