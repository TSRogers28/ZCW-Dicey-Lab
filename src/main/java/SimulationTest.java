
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

/**
 * The test class SimulationTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SimulationTest
{
    @Test
    public void testRunSimulation(){
        Simulation sim1 = new Simulation(2, 1_000);
        sim1.runSimulation();
        Set<Integer> expected = 
            new HashSet<>(Arrays.asList(2,3,4,5,6,7,8,9,10,11,12));
        Bins bin = sim1.getBin();
        Set<Integer> actual = bin.landedOnSet();
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertToStars(){
        Simulation sim1 = new Simulation(2, 1_000);

        String expected = "******";
        String actual = sim1.convertToStars(6);

        assertEquals(expected, actual);
    }

    
}
