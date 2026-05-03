import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SecondHighest {
    public static void main(String[] args) {
        int arr[]={34,23,56,12,90,56,77,44,23,78};
        Arrays.sort(arr);
        Set<Integer> setData=new HashSet<>();
        for(int num:arr){
            setData.add(num);
        }
        int len=arr.length-1;
        System.out.println(arr[len-1]);
    }
}
