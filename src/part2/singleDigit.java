package part2;

public class singleDigit {
    public static void main(String[] args) {
        int digit=123123123;
        int n=digit;
        int sum=0;
      while(n>0) {
          while (n > 0) {
              int c = n % 10;
              sum = sum + c;
              n = n / 10;
          }
         if (sum>9){
             n=sum;
             sum=0;
         }
      }

      System.out.println(sum);
    }
}
