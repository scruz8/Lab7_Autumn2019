package edu.cscc;
import java.util.Random;

/**
 * Holds the methods needed for the RPSLSpock game.
 * @author Sergio Cruz
 */
public class RPSLSpock {

    static Random rand = new Random(System.currentTimeMillis());

    public static final String ROCK = "rock";
    public static final String PAPER = "paper";
    public static final String SCISSORS = "scissors";
    public static final String LIZARD = "lizard";
    public static final String SPOCK = "spock";

    /**
     * Makes sure that the user's choice is valid
     * @param pick User's choice for RPSLSpock
     * @return True - If the choice is valid, False - If the choice is invalid.
     */
    public static boolean isValidPick(String pick) {
        if (pick == null) {
            return false;
        }
        pick = pick.trim();;
        return (ROCK.equalsIgnoreCase(pick) ||
                PAPER.equalsIgnoreCase(pick) ||
                SCISSORS.equalsIgnoreCase(pick) ||
                LIZARD.equalsIgnoreCase(pick) ||
                SPOCK.equalsIgnoreCase(pick));
    }

    /**
     * Generates the computer's five possible answers.
     * @return Generates the computers pick.
     */
    public static String generatePick() {
        String pick = null;
        switch (rand.nextInt(5)) {
            case 0:
                pick = ROCK;
                break;
            case 1:
                pick = PAPER;
                break;
            case 2:
                pick = SCISSORS;
                break;
            case 3:
                pick = LIZARD;
                break;
            case 4:
                pick = SPOCK;
                break;
        }
        return pick;
    }

    /**
     * Checks to see if the computer won the game.
     * @param c_pick Computer's choice
     * @param h_pick Human player's choice
     * @return The Computers win if true.
     */
    public static boolean isComputerWin(String c_pick,String h_pick) {
        h_pick = h_pick.toLowerCase();
        return ((ROCK.equals(c_pick) && (SCISSORS.equals(h_pick) || LIZARD.equals(h_pick)))
                ||
                (PAPER.equals(c_pick) && (ROCK.equals(h_pick) || SPOCK.equals(h_pick)))
                ||
                (SCISSORS.equals(c_pick) && (PAPER.equals(h_pick) || LIZARD.equals(h_pick)))
                ||
                (LIZARD.equals(c_pick) && (PAPER.equals(h_pick) || SPOCK.equals(h_pick)))
                ||
                (SPOCK.equals(c_pick) && (ROCK.equals(h_pick) || SCISSORS.equals(h_pick))));
    }
}