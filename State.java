/**
 * @author Colton Anderson
 * specifies the method that each mode must implement
 */
public interface State {
    public int getNum();
    public String getOperation();
    public void levelUp();
    public void levelDown();
}
