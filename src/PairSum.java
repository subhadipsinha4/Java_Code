import java.util.HashSet;
import java.util.Set;

public class PairSum {
    public static void main(String[] args) {
        int arr[]={2,4,5,2,3,9,8};
        int number=130;

        Set<Integer> setData=new HashSet<>();

        for(int num: arr){
            int pair=number-num;
            if(setData.contains(pair)){
                System.out.println(num+" and "+pair);
            }
            setData.add(num);
        }

    }
}
