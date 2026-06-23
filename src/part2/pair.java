package part2;

import java.util.HashSet;
import java.util.Set;

public class pair {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8};
        int target=10;
        Set<Integer> data=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            int diff=target-arr[i];
            if(data.contains(diff)){
                System.out.println("Pair: "+arr[i]+" and "+diff);
                break;
            }
            data.add(arr[i]);
        }
    }
}
