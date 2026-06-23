package part3;

import java.util.HashSet;
import java.util.Set;

public class Paieer {
    public static void main(String[] args) {
        int arr[]={2,1,3,4,6,7,5,9};
        int target=10;

        Set<Integer> data=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int diff=target-arr[i];
            if(data.contains(diff)){
                System.out.println("Pair of : "+arr[i]+" "+diff);
                break;
            }
            data.add(arr[i]);
        }
    }
}
