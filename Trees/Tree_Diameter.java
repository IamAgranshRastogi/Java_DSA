package Trees;

public class Tree_Diameter {
    static class Node1{
        int data;
        Node1 left, right;
    
        public Node1(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node1 root){
       if(root == null){
        return 0;
       }
       int lh = height(root.left);
       int rh = height(root.right);
       return Math.max(lh,rh) + 1;
    }
    public static void main(String args[]){
    /*           1
               /   \
              2     3
             / \   / \
            4   5 6   7  
    */
       Node1 root = new Node1(1);
       root.left = new Node1(2);
       root.right = new Node1(3);
    // root.left.left   = new Node1(4);
    // root.left.right  = new Node1(5);
    // root.right.left  = new Node1(6);
    // root.right.right = new Node1(7);
       System.out.println(height(root));
    }
}
