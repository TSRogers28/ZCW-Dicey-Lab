
/**
 * Write a description of class BlackJack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BlackJack extends CardGame implements Gambling, Game
{
    Card deck = new Card();
    private int x;

    /**
     * Constructor for objects of class BlackJack
     */
    public BlackJack()
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
