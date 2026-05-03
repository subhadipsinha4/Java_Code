import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        String text="dddaef";

        HashMap<Character, Integer> unique=new HashMap();


        for(int i=0;i<text.length();i++){
            if(unique.containsKey(text.charAt(i))) {
                unique.put(text.charAt(i), unique.get(text.charAt(i))+1);
            }
            else{
                unique.put(text.charAt(i), 1);
            }
        }

        for(int i=0;i<unique.size();i++){
            int value=unique.get(text.charAt(i));
            if(value==1){
                System.out.println(text.charAt(i));
            }
        }

    }
}
