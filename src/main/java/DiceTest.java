
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

/**
 * The test class DiceTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DiceTest
{   
    @Test
    public void tossOneDiceValue() {
        Dice diceValue1= new Dice(1);
        int actual = diceValue1.toss();
        Assert.assertTrue(1<= actual && actual <= 6);
    }

    @Test
    public void tossTwoDiceValues() {
        Dice diceValue2= new Dice(2);
        int actual = diceValue2.toss();
        Assert.assertTrue(2 <= actual && actual <= 12);
    }

    @Test
    public void testDiceTossAndSumTenThousandDice(){
        Dice diceValue5= new Dice(10_000);
        int actual = diceValue5.toss();
        Assert.assertTrue(20_000 <= actual && actual <= 60_000);
    }
}

