
/**
 * Write a description of class Threes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Threes implements Gambling, Game
{
    Dice dice = new Dice();
    private int x;

    /**
     * Constructor for objects of class Threes
     */
    public Threes()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
