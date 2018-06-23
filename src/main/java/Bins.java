import java.util.Map;
import java.util.*;

public class Bins {
    Map<Integer, Integer> result;
    int temp;
    int total;
    public Bins(){
        result = new TreeMap<Integer, Integer>();
    }

    public Set<Integer> landedOnSet(){
        return result.keySet();
    }

    public int getSize(){
        return result.size();
    }

    public int getBin(int n){
        return  result.get(n);
    }

    public void incrementBin(int landedOn){
        if(!result.containsKey(landedOn))
            result.put(landedOn, 1);
        else
            temp = result.get(landedOn);
        result.put(landedOn, ++temp);
    }
}

