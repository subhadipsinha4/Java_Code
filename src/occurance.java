import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class occurance {
    public static void main(String[] args) {
        String name="I ammm Suuuubhaaaddiiip";

        Map<Character,Integer> map=new HashMap<>();

        for(char c: name.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer>entry : map.entrySet()){
            if(entry.getValue()>1){
                System.out.println("Key: "+entry.getKey()+" "+entry.getValue());
            }
        }
    }
}
