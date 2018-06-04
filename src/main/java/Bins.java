
public class Bins {
private int[] results;    
    
public Bins(int min, int max){
 results = new int [max +1];

}

public int getBin(int n){
return results[n];
}

public void incrementBin(int x){
results[x] += 1;
}



}

