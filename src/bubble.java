import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int arr[]={10,34,25,45,20,3};
        Arrays.sort(arr);

        int search=3;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==search){
                System.out.println("Got it: "+arr[mid]);
                break;
            }else if(arr[mid]<search){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
    }
}
