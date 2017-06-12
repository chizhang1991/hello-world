public class MinStack {
    Stack<Integer> minStack;
    Stack<Integer> iStack;
    /** initialize your data structure here. */
    public MinStack() {
        minStack = new Stack<Integer>();
        iStack = new Stack<Integer>();
    }
    
    public void push(int x) {
        iStack.push(x);
        if(minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }
    
    public void pop() {
        int temp = iStack.pop();
        if(!minStack.isEmpty() && minStack.peek() == temp) {
            minStack.pop();
        }
    }
    
    public int top() {
        return iStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */