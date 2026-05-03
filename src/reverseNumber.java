public class reverseNumber {
    public static void main(String[] args) {
        int arr[]={32,45,23,23,10,45,67};
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            high--;
            low++;
        }
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
}
