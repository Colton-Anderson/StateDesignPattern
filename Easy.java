import java.util.Random;

public class Easy implements State{
    private ArithemeticGame game;

    private Random rand = new Random();
    private String[] operation = {"+","-"};

    public Easy(ArithemeticGame game) {
        this.game = game;
    }

    public int getNum() {
        int randNum = rand.nextInt(10);
        randNum++;
        return randNum;
    }

    public String getOperation() {
        int randOp = rand.nextInt(2);
        return operation[randOp];
    }

    public void levelUp() {
        System.out.println("You've been advanced to medium mode.");
        game.setState(game.getMediumState());
    }

    public void levelDown() {
        System.out.println("You seem to be struggling, you may want to study.");
    }
}
