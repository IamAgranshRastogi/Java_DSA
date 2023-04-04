import static java.lang.System.exit;

public class StackUsingLL
{// Java program to Implement a stack
// using singly linked list
// import package

    // Create Stack Using Linked list

                private class Node    // A linked list node
                {  int data; // integer data
                   Node next; // reference variable Node type
                }
                   Node top;   // create global top reference variable global
                StackUsingLL()      // Constructor
               {   this.top = null;
               }
               static void push(int x)  // Utility function to add an element x in the stack
              {                            // insert at the beginning
                  Node temp = new Node();   // create new node temp and allocate memory
                  if(temp == null)        //check if stack is full. Then inserting an element would lead stackoverflow
                {  System.out.println("\n Heap Overflow");
                   return;
                }
                  temp.data = x;   // initialize data into temp data field
                  temp.next = top;   // put top reference into temp link
                  top = temp;      // update top reference
              }
              public boolean isEmpty()    // Utility function to check if the stack is empty or not
              {  return top == null;
              }
              public int peek()   // Utility function to return top element in a stack
             {   if (!isEmpty())    // check for empty stack
                 {  return top.data;
                 }
                 else
                 {   System.out.println("Stack is empty");
                     return -1;
                 }
             }
             public void pop()    // Utility function to pop top element from the stack
             {
                 if (top == null)
             {                  // remove at the beginning
                System.out.print("\nStack Underflow");
                return;
            }

            // update the top pointer to point to the next node
            top = (top).next;
        }

        public void display()
        {
            // check for stack underflow
            if (top == null)
            {
                System.out.printf("\nStack Underflow");
                exit(1);
            }
            else
            {
                Node temp = top;
                while (temp != null)
                {  System.out.printf("%d->", temp.data);  // print node data
                    temp = temp.next;     // assign temp next to temp
                }
            }
        }
        public static void main(String[] args)
        {   StackUsingLL obj = new StackUsingLL();        // create Object of Implementing class
            obj.push(11);    // insert Stack value
            obj.push(22);
            obj.push(33);
            obj.push(44);
            obj.display();       // print Stack elements
            System.out.printf("\nTop element is %d\n", obj.peek());   // print Top element of Stack
            obj.pop();       // Delete top element of Stack
            obj.pop();
            obj.display();    // print Stack elements
            System.out.printf("\nTop element is %d\n", obj.peek());     // print Top element of Stack
        }
}


