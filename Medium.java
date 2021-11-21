import java.util.Random;

/**
 * @author Colton Anderson
 * Hold the information for the Medium Mode
 * Implemts the state interface
 */
public class Medium implements State{
    private ArithemeticGame game;

    private Random rand = new Random();
    private String[] operation = {" + "," - "," * "};

    /**
     * Constructor
     * @param game
     */
    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * Returns a random number 1 through 10
     * @return randNum;
     */
    public int getNum() {
        int randNum = rand.nextInt(50);
        randNum++;
        return randNum;
    }

    /**
     * Returns a random operation
     * @return randOp
     */
    public String getOperation() {
        int randOp = rand.nextInt(3);
        return operation[randOp];
    }

    /**
     * Advances the level to hard
     */
    public void levelUp() {
        System.out.println("You've been advanced to the hardest mode.");
        game.setState(game.getHardState());
    }

    /**
     * Levels the user down to easy mode
     */
    public void levelDown() {
        System.out.println("You are struggling, let's go to easy mode.");
        game.setState(game.getEasyState());
    }
}
