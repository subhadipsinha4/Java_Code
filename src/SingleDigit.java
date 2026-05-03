public class SingleDigit {
    public static void main(String[] args) {
                int number=123456789;
                int sum=0;
                while (number > 0) {
                    int n = number % 10;
                    sum = sum + n;
                    number = number / 10;
                    if(number==0 && sum>9){
                        number=sum;
                        sum=0;
                    }
                }
                System.out.println("Single Digit is: "+sum);
            }
}
