public class removeSpace {
    public static void main(String[] args) {
        String name="i am dip";
        int end=name.length();
        for(int i=name.length()-1; i>=0;i--){
            if(name.charAt(i)==' '){
               System.out.print(name.substring(i+1,end));
               end=i;
            }else if (i==0){
                System.out.print(name.substring(i,end));
            }
        }

    }
}
