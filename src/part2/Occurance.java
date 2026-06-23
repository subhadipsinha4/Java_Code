package part2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Occurance {
    public static void main(String[] args) {
        String text="i am subhadip sinha";
        Map<Character,Integer> data=new LinkedHashMap<>();

        for(char c: text.toCharArray()){
            data.put(c,data.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry: data.entrySet()){
            if(entry.getValue()>1){
                System.out.println("Key: "+entry.getKey()+" value:"+entry.getValue());
            }
        }
    }
}
