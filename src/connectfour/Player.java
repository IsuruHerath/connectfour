package connectfour;

/**
 *
 * @author prakhash
 */
public interface Player {

    public void go(SimpleBoard b);

    public void setMove(int col);

    public int getType();
}
