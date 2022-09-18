class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int ans=0;
        
        for(String i : ops){
            if(i.equals("C")) ans -= stack.pop();
            else if(i.equals("D")) ans += stack.push(2*stack.peek());
            else if(i.equals("+")){
                int a=stack.pop();
                int b = a + stack.peek();
                stack.push(a);
                stack.push(b);
                ans += b;
            } 
            else ans += stack.push(Integer.parseInt(i));
        }
        return ans;
    }
}