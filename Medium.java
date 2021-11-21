import java.util.Random;

public class Medium implements State{
    private ArithemeticGame game;

    private Random rand = new Random();
    private String[] operation = {"+","-","*"};

    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    public int getNum() {
        int randNum = rand.nextInt(50);
        randNum++;
        return randNum;
    }

    public String getOperation() {
        int randOp = rand.nextInt(3);
        return operation[randOp];
    }

    public void levelUp() {
        System.out.println("You've been advanced to the hardest mode.");
        game.setState(game.getHardState());
    }

    public void levelDown() {
        System.out.println("You are struggling, let's go to easy mode.");
        game.setState(game.getEasyState());
    }
}
