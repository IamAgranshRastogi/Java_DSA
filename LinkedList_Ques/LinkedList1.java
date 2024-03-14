package LinkedList_Ques;

class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        data = data1;
        next = next1;
    }

    Node(int data1){
        data = data1;
        next = null;
    }
}


public class LinkedList1 {
   public static void main(String[] args) {
    int a[] = {2,5,8,7};
    Node head = new Node(a[0]);
    head.next = new Node(a[1]);
    head.next.next = new Node(a[2]);
    head.next.next.next = new Node(a[3]);

    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
   } 
}

// TC: O(n)   iterating over array
// SC: O(1)