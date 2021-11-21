/**
 * @author Colton Anderson
 * Hold the information to play the Arithmetic Game
 */
import java.util.Scanner;

public class ArithemeticGame {

    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    private Scanner reader;

    /**
     * A constructor which creates the various states
     * Initializes the score to be 0 and the game mode to be easy
     */
    public ArithemeticGame() {
        reader = new Scanner(System.in);
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        score = 0;
        setState(getEasyState());
    }

    /**
     * Asks the user a question based on what game mode they are in
     */
    public void pressQuestionButton() {
        
        int num1 = state.getNum();
        String operation = state.getOperation();
        int num2 = state.getNum();
        System.out.print(num1 + operation + num2 + " = : ");
        int answer = reader.nextInt();
        if(getCorrectAnswer(num1,operation,num2) == answer) {
            score++;
            System.out.println("Correct");
            checkLevel();
        } else {
            score--;
            System.out.println("Incorrect");
            checkLevel();
        }
    }

    /**
     * Determines if the level needs to be changed or not based on teh users score
     * If the level changes the score is reset to 0
     */
    private void checkLevel() {
        if(score == 3) {
            state.levelUp();
            score = 0;
        } else if(score == -3) {
            state.levelDown();
            score = 0;
        }
    }

    /**
     * Calculates the correct answer based on the two number and operation
     * @param num1
     * @param operation
     * @param num2
     * @return correctAnser;
     */
    private int getCorrectAnswer(int num1, String operation, int num2) {
        int correctAnswer = 0;
        if(operation.equals(" + ")) {
            correctAnswer = num1 + num2;
        } else if(operation.equals(" - ")) {
            correctAnswer = num1 - num2;
        } else if(operation.equals(" * ")) {
            correctAnswer = num1 * num2;
        } else if(operation.equals(" / ")) {
            correctAnswer = num1 / num2;
        }
        return correctAnswer;
    }

    /**
     * sets mode that the user is currently in
     * @param state
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * returns the Easy Mode
     * @return easyState
     */
    public State getEasyState() {
        return easyState;
    }

    /**
     * returns the Medium Mode
     * @return mediumState
     */
    public State getMediumState() {
        return this.mediumState;
    }

    /**
     * returns the Hard Mode
     * @return hardState
     */
    public State getHardState() {
        return this.hardState;
    }
}