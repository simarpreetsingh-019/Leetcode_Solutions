class MyQueue {
    
    private Stack<Integer> first = new Stack<>();
    private Stack<Integer> second = new Stack<>();
    
    public MyQueue() {
        
    }
    


    public void push(int x) 
    {
        first.push(x);
        move();
    }
    
    public int pop()
    {        
        move();
        return second.pop();
    }
    
    public int peek()
    {
        move();
        return second.peek();
    }
    
    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }
    
    private void move() {
        if (!second.isEmpty()) {
            return;
        }
        while(!first.isEmpty()) {
            second.push(first.pop());
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */