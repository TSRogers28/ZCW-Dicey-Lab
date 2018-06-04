public class Simulation {
private int numberOfDices;
private int numberofTosses;
private Dice simulatedDice;
private Bins resultBin;

public Simulation(int numberOfDices,int numberofTosses){
this.numberOfDices =numberOfDices;
this.numberofTosses = numberofTosses;
Dice simulatedDice = new Dice(numberOfDices);
Bins resultBin = new Bins(numberOfDices, numberOfDices*6);
}



public void runSimulation(){

    for(int x = 1; x <= numberofTosses; x++){
     
     int result = this.simulatedDice.tossAndSum();
     resultBin.incrementBin(result);
    }
}

public void printResults(){
for(int x = numberOfDices; x <= numberOfDices*6; x++){
    String label = x  + " : " + "\t " +resultBin.getBin(x);
System.out.println(label + convertToStars(resultBin.getBin(x)/200));
}
}

private String convertToStars(int num){
StringBuilder builder = new StringBuilder();
for (int j = 0; j < num; j++){
       builder.append('*');
}
return builder.toString();
}

}




