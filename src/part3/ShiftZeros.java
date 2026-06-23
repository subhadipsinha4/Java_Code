package part3;

public class ShiftZeros {
    public static void main(String[] args) {
        int arr[]={2,0,3,0,5,0,6};
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }

        for(int i=index;i<arr.length;i++){
            arr[i]=0;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
