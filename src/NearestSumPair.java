public class NearestSumPair {
    public static void main(String[] args) {
        int arr[]={10,20,30,24,18,39};
        int target=53;
        int low=Integer.MAX_VALUE;
        int pair1=0;
        int pair2=0;

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum=arr[i]+arr[j];
                int diff=Math.abs(target-sum);

                if(low>diff){
                    low=diff;
                    pair1=arr[i];
                    pair2=arr[j];
                }
            }
        }
        System.out.println("Pair is: "+pair1+" another: "+pair2);
    }
}
