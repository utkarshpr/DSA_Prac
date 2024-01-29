class MyQueue {
     Stack<Integer> s;
    Stack<Integer> pop;
    public MyQueue() {
        s = new Stack<>();
        pop=new Stack<>();
    }
    
    public void push(int x) {
        s.push(x);
    }
    
    public int pop() {
        if(pop.isEmpty())
            while(!s.isEmpty())
                pop.push(s.pop());
        return pop.pop();        
    }
    
    public int peek() {
        if(pop.isEmpty())
            while(!s.isEmpty())
                pop.push(s.pop());
        return pop.peek();        
    }
    
    public boolean empty() {
        return s.isEmpty() && pop.isEmpty();
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