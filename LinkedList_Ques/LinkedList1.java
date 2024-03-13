package LinkedList_Ques;
import java.util.Scanner;
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
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
    }
    Node head = new Node(a[0]);
    head.next = new Node(a[1]);
    head.next.next = new Node(a[2]);
    head.next.next.next = new Node(a[3]);
    s.close();
   } 
}
