
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String [] args){
        Simulation sim = new Simulation(2, 1000000);    
        sim.runSimulation();
        sim.printResults();
    }
}
