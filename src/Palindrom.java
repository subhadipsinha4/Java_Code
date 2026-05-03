public class Palindrom {
    public static void main(String[] args) {
        String test="MADAM";
        String data="";
        for(int i=test.length()-1;i>=0;i--){
            data=data+test.charAt(i);
        }

        if (test.equals(data)){
            System.out.println("Match");
        }else{
            System.out.println("not Match");

        }
    }
}
