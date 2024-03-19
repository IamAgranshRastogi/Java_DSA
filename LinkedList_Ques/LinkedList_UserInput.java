package LinkedList_Ques;
import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList_UserInput {
    Node head;
    LinkedList_UserInput(){
        head = null;
    }

    void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void printLinkedList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    int getSize(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList_UserInput ll= new LinkedList_UserInput();
        System.out.println("Enter the number of elements you want to insert:");
        int n = s.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int data = s.nextInt();
            ll.insert(data);
        }
        System.out.println("Linked List elements:");
        ll.printLinkedList(ll.head);
    
        System.out.println("Size of the Linked List: " + ll.getSize(ll.head));
        s.close();
    }
}


