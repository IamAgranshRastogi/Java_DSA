package Queues;
public class QueueUsingArray {
    // Class to represent a queue
    class Queue {
        int front, rear, size;
        int capacity;
        int array[];

        public Queue(int capacity) {
            this.capacity = capacity;
            front = this.size = 0;
            rear = -1; // Initialize rear to -1 instead of capacity - 1
            array = new int[this.capacity];
        }

        boolean isFull() {
            return (size == capacity); // Use instance variables directly
        }

        boolean isEmpty() {
            return (size == 0); // Use instance variables directly
        }

        void enqueue(int item) {
            if (isFull())
                return;
            rear = (rear + 1) % capacity;
            array[rear] = item;
            size = size + 1;
            System.out.println(item + " enqueued to queue");
        }

        int dequeue() {
            if (isEmpty())
                return Integer.MIN_VALUE;

            int item = array[front];
            front = (front + 1) % capacity;
            size = size - 1;
            return item;
        }

        int getFront() { // Renamed to getFront() to avoid naming conflict
            if (isEmpty())
                return Integer.MIN_VALUE;

            return array[front];
        }

        int getRear() { // Renamed to getRear() to avoid naming conflict
            if (isEmpty())
                return Integer.MIN_VALUE;

            return array[rear];
        }
    }

    // Driver class
    public static void main(String[] args) {
        QueueUsingArray outer = new QueueUsingArray(); // Need an instance of the outer class
        Queue queue = outer.new Queue(1000); // Create an instance of the inner Queue class

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue() + " dequeued from queue\n");

        System.out.println("Front item is " + queue.getFront());

        System.out.println("Rear item is " + queue.getRear());
    }
}
