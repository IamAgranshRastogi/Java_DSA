package queues;
import java.util.*;

public class QueueUsingStack {
    static class Queue {
        private Stack<Integer> s1 = new Stack<>();
        private Stack<Integer> s2 = new Stack<>();

        void enQueue(int x) {
            // Move elements from s1 to s2 to maintain queue order
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // Push the new element onto s1
            s1.push(x);

            // Push back elements from s2 to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        int deQueue() {
            if (s1.isEmpty()) {
                System.out.println("Queue is Empty");
                System.exit(0);
            }

            // Pop the front element from s1 (since it contains queue elements)
            return s1.pop();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }
}

