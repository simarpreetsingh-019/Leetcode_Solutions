// class MyQueue {
    
//     private Stack<Integer> first = new Stack<>();
//     private Stack<Integer> second = new Stack<>();
    
//     public MyQueue() {
        
//     }
    


//     public void push(int x) 
//     {
//         first.push(x);
//         move();
//     }
    
//     public int pop()
//     {        
//         move();
//         return second.pop();
//     }
    
//     public int peek()
//     {
//         move();
//         return second.peek();
//     }
    
//     public boolean empty() {
//         return first.isEmpty() && second.isEmpty();
//     }
    
//     private void move() {
//         if (!second.isEmpty()) {
//             return;
//         }
//         while(!first.isEmpty()) {
//             second.push(first.pop());
//         }
//     }
// }

// /**
//  * Your MyQueue object will be instantiated and called as such:
//  * MyQueue obj = new MyQueue();
//  * obj.push(x);
//  * int param_2 = obj.pop();
//  * int param_3 = obj.peek();
//  * boolean param_4 = obj.empty();
//  */

class MyQueue {
    private Stack<Integer> stack;
    public MyQueue() {
        stack=new Stack<Integer>();
    }
    
    public void push(int x){
        stack.push(x);
    }
    
    public int pop() {
        int front=stack.firstElement();
        Stack<Integer> backup=new Stack<Integer>();
        while(!stack.empty())
        {
            backup.push(stack.pop());
        }
        backup.pop();
        while(!backup.empty())
        {
            stack.push(backup.pop());
        }
        return front;
    }
    
    public int peek() {
        return stack.firstElement();
    }
    
    public boolean empty() {
        return stack.empty();
    }
}