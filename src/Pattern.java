import java.util.Stack;

public class Pattern {
    public static void main(String[] args) {
        String input[]={"(){}[]","({[]})","{[()]}","([]{}"};
        for(int i=0;i<input.length;i++){
            System.out.println("This Vaild: "+isPatternMatch(input[i]));
        }
    }

    public static boolean isPatternMatch(String s) {
        Stack<Character> stack=new Stack<>();
        for(Character c: s.toCharArray()){
            if(c=='('|| c=='{'||c=='['){
                stack.push(c);
            }else{
                if (stack.isEmpty())
                    return false;
                char top=stack.pop();
                if((top=='('&& c!=')')||(top=='{'&& c!='}')||(top=='['&& c!=']')){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
