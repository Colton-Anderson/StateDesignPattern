import java.util.Random;

public class Hard implements State{
    private ArithemeticGame game;

    private Random rand = new Random();
    private String[] operation = {"+","-","*","/"};

    public Hard(ArithemeticGame game) {
        this.game = game;
    }

    public int getNum() {
        int randNum = rand.nextInt(100);
        randNum++;
        return randNum;
    }

    public String getOperation() {
        int randOp = rand.nextInt(4);
        return operation[randOp];
    }

    public void levelUp() {
        System.out.println("You are doing so well!!");
    }

    public void levelDown() {
        System.out.println("You are struggling, lets go to medium mode.");
        game.setState(game.getMediumState());
    }
}
