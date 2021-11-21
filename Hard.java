import java.util.Random;

/**
 * @author Colton Anderson
 * Hold the information for the Hard Mode
 * Implements the state interface;
 */
public class Hard implements State{
    private ArithemeticGame game;

    private Random rand = new Random();
    private String[] operation = {" + "," - "," * "," / "};

    /**
     * Constructor
     * @param game
     */
    public Hard(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * Returns a random number 1 through 10
     * @return randNum;
     */
    public int getNum() {
        int randNum = rand.nextInt(100);
        randNum++;
        return randNum;
    }

    /**
     * Returns a random operation
     * @return randOp
     */
    public String getOperation() {
        int randOp = rand.nextInt(4);
        return operation[randOp];
    }

    /**
     * Prints a message signifying they are at the highest level
     */
    public void levelUp() {
        System.out.println("You are doing so well!!");
    }

    /**
     * Levels the user down to Medium Mode
     */
    public void levelDown() {
        System.out.println("You are struggling, lets go to medium mode.");
        game.setState(game.getMediumState());
    }
}
