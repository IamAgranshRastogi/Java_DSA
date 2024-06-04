package queues;
class QNode {
    int key;
    QNode next;

    public QNode(int key) {
        this.key = key;
        this.next = null;
    }
}

public class QueueUsingLL {
    QNode front, rear;

    public QueueUsingLL() {
        this.front = this.rear = null;
    }

    void enqueue(int key) {
        QNode temp = new QNode(key);

        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        this.rear.next = temp;
        this.rear = temp;
    }

    void dequeue() {
        if (this.front == null) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return;
        }

        this.front = this.front.next;

        if (this.front == null) {
            this.rear = null;
        }
    }

    public static void main(String[] args) {
        QueueUsingLL q = new QueueUsingLL();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        
        if (q.front != null) {
            System.out.println("Queue Front: " + q.front.key);
        } else {
            System.out.println("Queue is empty.");
        }
        
        if (q.rear != null) {
            System.out.println("Queue Rear: " + q.rear.key);
        } else {
            System.out.println("Queue is empty.");
        }
    }
}

