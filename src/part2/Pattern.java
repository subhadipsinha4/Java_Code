package part2;

import java.util.Stack;

public class Pattern {
    public static void main(String[] args) {
        String input[]={"(){}[]","({[]})","{[()]}","([]{}"};
        for(String s: input) {
            System.out.println("Is Valid: " + checkValid(s));
        }
    }

    private static Boolean checkValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='('|| c=='{'||c=='['){
                stack.push(c);
            }else{
                if(stack.isEmpty())
                    return false;
                char top=stack.pop();
                if((c==')' && top !='(') || (c=='}' && top !='{')||(c==']' && top !='[')){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
