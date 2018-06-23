
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

/**
 * The test class BinsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BinsTest
{

    @Test
    public void testIncrementBin2(){
        Bins testBin1 = new Bins();
        testBin1.incrementBin(2);
        int expected = 1;
        int actual = testBin1.getBin(2);
        assertEquals(expected, actual);
    }

    @Test
    public void testIncrementBin7(){
        Bins testBin2 = new Bins();
        testBin2.incrementBin(7);
        int expected = 1;
        int actual = testBin2.getBin(7);
        assertEquals(expected, actual);
    }

    @Test
    public void testIncrementBin12(){
        Bins testBin3 = new Bins();
        testBin3.incrementBin(12);
        int expected = 1;
        int actual = testBin3.getBin(12);
        assertEquals(expected, actual);
    }

    @Test
    public void testIncrementBinWithOneDiceRoll(){
        Bins testBin3 = new Bins();
        Dice testDice = new Dice(2);
        testBin3.incrementBin(testDice.toss());
        int expected = 1;
        int actual = testBin3.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void testIncrementBinSizeWithOneThousandDiceRolls(){
        Bins testBin3 = new Bins();
        Dice testDice = new Dice(2);
        for(int x = 0; x < 1000; x++)
            testBin3.incrementBin(testDice.toss());
        int expected = 11;
        int actual = testBin3.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void testIncrementBinNumbersWithOneThousandDiceRolls(){
        Bins testBin3 = new Bins();
        Dice testDice = new Dice(2);

        for(int x = 0; x < 1000; x++)
            testBin3.incrementBin(testDice.toss());

        Set<Integer> expected = 
            new HashSet<>(Arrays.asList(2,3,4,5,6,7,8,9,10,11,12));

        Set<Integer> actual = testBin3.landedOnSet();

        assertEquals(expected, actual);
    }

    
    @Test
    public void testIncrementBinOneMillion(){
        Bins testBin10 = new Bins();
        for(int x =1; x <= 1_000_000; x++){
            testBin10.incrementBin(12);
        }
        int expected = 1_000_000;
        int actual = testBin10.getBin(12);
        assertEquals(expected, actual);
    }

}
