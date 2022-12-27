import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        char[] a=s.toCharArray();
        Stack<Character> stack= new Stack<>();
        for(char c: a){
            char cc=0;
            if(!stack.isEmpty() && c==')' && stack.peek()=='(')stack.pop();
            else if(!stack.isEmpty() && c=='}' && stack.peek()=='{')stack.pop();
            else if(!stack.isEmpty() && c==']' && stack.peek()=='[')stack.pop();
            else stack.push(c);
        }
        return stack.size()==0;
    }

    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("()[]{}"));

    }
}
