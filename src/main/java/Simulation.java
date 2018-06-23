import java.util.*;
import java.util.Iterator;

public class Simulation {
    private int numberofTosses;
    private Dice simDice;
    public Bins resultBin;

    public Simulation(int numberOfDice,int numberofTosses){
        resultBin = new Bins();
        simDice = new Dice(numberOfDice);
        this.numberofTosses = numberofTosses;
    }

    public Bins getBin(){
        return resultBin;
    } 

    public void runSimulation(){
        for(int x = 1; x <= numberofTosses; x++){
            resultBin.incrementBin(simDice.toss());
        }

    }

    public void printResults(){
        System.out.println("***");
        System.out.println("Simulation of "+simDice.getNumOfDice()+" dice tossed for " +numberofTosses+" times.");
        System.out.println("***");
        System.out.println();    

        for(int diceNum = simDice.getNumOfDice(); diceNum <= simDice.getNumOfDice()*6; diceNum++){
            float percent = (float) resultBin.getBin(diceNum)/numberofTosses;
            int totalRolled = resultBin.getBin(diceNum);
            String stars = convertToStars(resultBin.getBin(diceNum)/10000);
            System.out.printf("%2d:    %6d: %.2f %s", diceNum, totalRolled, percent, stars);
            System.out.println();
        }
    }

    public String convertToStars(int num){
        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < num; j++){
            builder.append('*');
        }
        return builder.toString();
    }

}


