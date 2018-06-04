
import java.util.Random;

public class Dice {


private int numOfDice;

public Dice(int numOfDice){
this.numOfDice = numOfDice;

}


public int tossAndSum(){
int sum = 0;    
for(int x = 0; x <= numOfDice; x++){    
int landedOn = (int) (6*Math.random() +1);
sum += landedOn;
}
return sum;
}





}
