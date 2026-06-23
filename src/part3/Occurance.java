package part3;

import java.util.HashMap;
import java.util.Map;

public class Occurance {
    public static void main(String[] args) {
        String text="I am Subhadip Sinha";

        Map<Character,Integer> data=new HashMap<>();

        for(char c: text.toCharArray()){
            data.put(c,data.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry: data.entrySet()){
            if(entry.getValue()>1){
                System.out.println("k:"+entry.getKey()+" v:"+entry.getValue());
            }
        }
    }
}
