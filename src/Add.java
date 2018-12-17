import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Reza on 8/28/2018.
 */
public class Add {
    HashSet<String> stringHashSet = new HashSet<>();
    HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();

    public  void iterate(){
        for (String  ss : stringHashSet){
            System.out.println(ss);
        }

        for (HashMap.Entry<String, Integer> it : stringIntegerHashMap.entrySet()){

        }

        for (Integer val : stringIntegerHashMap.values()){
            System.out.println(val);
        }
    }
    public int add(int a, int b){
        return a+b;
    }

    public int sub(int a, int b){
        return a-b;
    }
}
