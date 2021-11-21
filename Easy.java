import java.util.Random;

/**
 * @author Colton Anderson
 * Holds the information needed for the Easy Mode
 * Implements the state interface
 */
public class Easy implements State{
    private ArithemeticGame game;

    private Random rand = new Random();
    private String[] operation = {" + "," - "};

    /**
     * Constructor
     * @param game
     */
    public Easy(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * Returns a random number 1 through 10
     * @return randNum;
     */
    public int getNum() {
        int randNum = rand.nextInt(10);
        randNum++;
        return randNum;
    }

    /**
     * Returns a random operation
     * @return randOp
     */
    public String getOperation() {
        int randOp = rand.nextInt(2);
        return operation[randOp];
    }

    /**
     * Advances the level to medium
     */
    public void levelUp() {
        System.out.println("You've been advanced to medium mode.");
        game.setState(game.getMediumState());
    }

    /**
     * Prints a message for leveling down
     */
    public void levelDown() {
        System.out.println("You seem to be struggling, you may want to study.");
    }
}
