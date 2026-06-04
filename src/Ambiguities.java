import java.util.*;

public class Ambiguities {
    public static void main(String[] args) {
        String text[]={"act","tac","cat","length","enghtl"};
        Map<String, List<String>> data=new HashMap<>();
        for(int i=0;i<text.length;i++){
            char[] c= text[i].toCharArray();
            Arrays.sort(c);
            String s=new String(c);
            if(!data.containsKey(s)){
                data.put(s,new ArrayList<>());
            }
            data.get(s).add(text[i]);
        }

        System.out.println(data.values());

    }
}
