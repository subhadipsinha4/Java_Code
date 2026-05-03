public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={2,4,6,10,12};

        for(int i=0;i<arr.length;i++){
             int diff=arr[i+1]-arr[i];
             if (diff>2){
                 System.out.println("Missing number: "+(arr[i]+diff-2));
                 break;
             }
        }
    }
}
