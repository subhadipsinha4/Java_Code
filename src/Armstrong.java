public class Armstrong {
    public static void main(String[] args) {
        int a=371;
        int temp=a;
        int sum=0;

        while(temp>0){
            int n=temp%10;
            sum= (int) (sum+Math.pow(n,3));
            temp=temp/10;
        }

        if (sum==a){
            System.out.println("Arm number: "+sum);
        }else {
            System.out.println("Not Arm number: "+sum);
        }
    }
}
