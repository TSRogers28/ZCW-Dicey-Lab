

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DiceTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DiceTest
{   Dice die;
    int number;
    private int randomNum;
    /**
     * Default constructor for test class DiceTest
     */
    public DiceTest()
    {
        Dice die = new Dice(number);
    }

    @Test
    public void testDiceTossAndSumTwoDice(){
    Dice die = new Dice(2);    
    int expected = 7;
    int actual = die.tossAndSum(2);
    
    
    
    Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testDiceTossAndSumFiveDice(){
    Dice die = new Dice(5);    
    int expected = 17;
    int actual = die.tossAndSum(5);
    
    
    
    Assert.assertEquals(expected, actual);
    }
}
