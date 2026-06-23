package part3;

public class NearPair {
    public static void main(String[] args) {
        int arr[]={10,20,43,12,54,31,19};
        int target=50;
        int low=99999;
        int pair1=0;
        int pair2=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
                int total=arr[i]+arr[j];
                int diff=Math.abs(target-total);
                if(low>diff){
                    low=diff;
                    pair1=arr[i];
                    pair2=arr[j];
                }
            }
        }

        System.out.println("k: "+pair1+" v:"+pair2);
    }
}
