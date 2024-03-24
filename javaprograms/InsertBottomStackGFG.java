public class InsertBottomStackGFG{
   public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> stack=new Stack<>();
        stack.push(x);
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(!st.isEmpty()){
            list.add(st.pop());
        }
        for(int i=list.size()-1;i>=0;i--){
            stack.push(list.get(i));
        }
        return stack;
    }
}
