public class Prime {
    public static void main(String[] args) {
        int a=7;
        int count=2;
        if(a>1){
            for(int i=2; i<a;i++){
                if(a%i==0){
                    System.out.println("It's not a prime: "+a);
                    count++;
                    break;
                }
            }
            if(count==2){
                System.out.println("it's a prime number: "+a);
            }
        }

    }
}
