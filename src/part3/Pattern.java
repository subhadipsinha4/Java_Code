package part3;

import java.util.Stack;

public class Pattern {
    public static void main(String[] args) {
        String input[]={"(){}[]","({[]})","{[()]}","([]{}"};
        for(int i=0;i<input.length;i++){
            System.out.println("Is Valid: "+isCorrect(input[i]));
        }
    }

    private static boolean isCorrect(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='('|| c=='{'||c=='['){
                stack.push(c);
            }else{
                if (stack.empty()){
                    return false;
                }
                char top=stack.pop();
                if((c==')' && top!='(')||(c=='}'&&top!='{')||(c==']'&& top!='[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
