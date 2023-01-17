package week13;

import week13.dice.Dice;
import week13.player.Bot;
import week13.player.Player;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Scanner terminalIn = new Scanner(System.in);
    private static ArrayList<Player> players = new ArrayList<>();
    private static ArrayList<Dice> dices = new ArrayList<>();
    private static Dice d;
    private static int number;

    //Menu1: Dice Game core functions
    private static void gameFunction(){
        var mode = true;
        do {
            showMenu();
            var in = terminalIn.nextLine();
            switch(Integer.parseInt(in)) {
                //0. Exit
                case 0:
                    System.out.println("Thanks for our participation!");
                    mode = false;
                    break;
                //1. New Game
                case 1:
                    try {
                        playGame();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                default:
                    System.out.println("Please enter right choice!");
                    break;

            }
        }
        while(mode);
    }
// Function 1: Play a new game
    private static void playGame() throws Exception {
        var mode = true;
        do {
            gameDetailsMenu();
            var in = terminalIn.nextLine();
            switch(Integer.parseInt(in)) {
                case 0:
                    players.clear();
                    Player.clearPLayer();
                    mode = false;
                    break;
                case 1:
                    //1. Add new players
                    addPlayers();
                    break;
                case 2:
                    //2. Start a new game
                    startGame();
                    break;

                default:
                    System.out.println("Please enter right choice!");
                    break;

            }
        }
        while(mode);

    }



    private static void addPlayers() {
        System.out.print("Enter the number of players: ");
        try {
            number = Integer.parseInt(terminalIn.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(int i = 0; i < number; ++i){
            System.out.print("Enter player's name: ");
            String name = terminalIn.nextLine();
            try {
                Player p = new Player(name);
                players.add(p);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private static void startGame() {
        String winner = "";
        int total = Player.getNUM();
        if (total < 4) {
            System.out.println("Automatically generate " + (4 - total) + " Bot");
            for (int i = 0; i < 4 - total; i++) {
                try {
                    players.add(new Bot());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        while (true) {
            int score = 0;
            for (Player p : players) {
                System.out.println("--------------------------------");
                System.out.println(p.getName() + "'s turn:");
                if (p instanceof Bot) {
                    p.rollDice(pickDice());
                    score = p.getScore();
                    if (score == -1) {
                        winner = p.getName();
                        break;
                    }
                    continue;
                }
                System.out.print("Enter to roll dice: ");
                terminalIn.nextLine();
                p.rollDice(pickDice());
                score = p.getScore();
                if (score == -1) {
                    break;
                }
            }
            if (score == -1) {
                break;
            }
        }
        for (Player p : players) {
            if (p instanceof Bot && !p.getName().equals(winner)) {
                ((Bot) p).loserExpressEmotion();
            }
        }
        players.removeIf(e -> e instanceof Bot);
        Player.clearBot(4 - total);
        Bot.clearBot();
    }

    private static Dice pickDice() {
        int randomNumber;
        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(4);
        return dices.get(randomNumber);
    }

    // All the menus
    public static void showMenu() {
        System.out.println("DICE GAME: ");
        System.out.println("--------------------------------");
        System.out.println("1. New game");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1");
    }
    public static void gameDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. New Players");
        System.out.println("2. Start");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void main(String[] args)
    {
        try {
            d = new Dice(1);
            dices.add(d);

            d = new Dice(2);
            dices.add(d);

            d = new Dice(3);
            dices.add(d);

            d = new Dice(4);
            dices.add(d);

            gameFunction();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
