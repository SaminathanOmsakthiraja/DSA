import java.util.ArrayDeque;
import java.util.Queue;

public class ImplementingStackUsingQueue {
    Queue<Integer> queue;
    public MyStack() {
        queue = new ArrayDeque<>();
    }
    
    public void push(int x) {
        queue.offer(x);
        int size = queue.size();
        for (int i = 0; i < size-1; i++)
            queue.offer(queue.poll());
    }
    public int pop() {
        if (queue.isEmpty())
            throw new RuntimeException("Stack is Empty");
        return queue.poll();
    }
    
    public int top() {
        if (queue.isEmpty())
            throw new RuntimeException("Stack is Empty");
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}
