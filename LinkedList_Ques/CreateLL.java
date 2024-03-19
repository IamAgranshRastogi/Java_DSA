package LinkedList_Ques;
import java.util.Scanner;

class CreateLL{
    Node1 head;
    class Node1{
        int data1;
        Node1 nextptr;
        
        Node1(int data1, Node1 nextptr){
            this.data1 = data1;
            this.nextptr = nextptr;
        }
    
        Node1(int data1){
            this.data1 = data1;
            this.nextptr = null; 
        }
    
    }
    
    
    //Adding ele as Head 
    public void AddHead(int data1){
        Node1 newnode = new Node1(data1);
        if( head == null){   // If Empty LL
            head = newnode;
            return;
        } 
        newnode.nextptr = head;    
        head = newnode; 
    }

    // Adding ele in LL after Head 
    public void AddEle(int data1){
        Node1 newnode = new Node1(data1);
        if( head == null){    // If Empty LL
            head = newnode;
            return;
        } 
        newnode.nextptr = head.nextptr;
        head.nextptr = newnode; 
    }

    // Adding ele in LL at last
    public void AddLast(int data1){
        Node1 newnode = new Node1(data1);
        if(head == null){
            head = newnode;
            return;
        }
        Node1 currnode = head;
        while(currnode.nextptr != null){
            currnode = currnode.nextptr; 
        } 
        currnode.nextptr = newnode;
    }

    // Print LL 
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node1 currnode = head;
        while(currnode !=null){
            System.out.print(currnode.data1 + " -> ");
            currnode=currnode.nextptr;
        }
        System.out.println("NULL");
    }
    
    



    public static void main(String[] args) {
        CreateLL list1 = new CreateLL();
        Scanner s = new Scanner(System.in);
        System.out.print("Add no.of nodes you want in LinkedList: ");
        int n =s.nextInt();
        System.out.println("Add elements of LinkedList: ");
        for(int i=0;i<n;i++){
            int val = s.nextInt();
            list1.AddEle(val); 
        } 
        System.out.println("Modification you want?(y/n): ");
        String ans = s.next();
        if(ans.charAt(0) == 'y'){
            System.out.println("Choose from it:  1) Add an ele at head 2) Add an ele at last 3) Add an ele in LL");
            int in = s.nextInt();
            if(in==1){
                int val = s.nextInt();
                list1.AddHead(val);
            } 
            else if(in==2){
                int val = s.nextInt();
                list1.AddLast(val);
            }
            else if(in==3){
                int val = s.nextInt();
                list1.AddEle(val);
            }
            else{
                System.out.println("Wrong Input");
            }
            System.out.print("");
        }
        s.close();
    }
}