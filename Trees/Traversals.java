package Trees;

public class Traversals {
    static class Node { 
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    static class BinaryTree {
        private int idx = -1;
        
        public Node buildTree(int[] nodes){
            idx++;
            if(idx >= nodes.length || nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]); 
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public void preorder(Node root){     // Root Left Right => TC: O(n) SC: O(h)
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public void inorder(Node root){      // Left Root Right => TC: O(n) SC: O(h)
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public void postorder(Node root){    // Left Right Root => TC: O(n) SC: O(h)
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void main(String[] args){
            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; 
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(nodes);
            System.out.println("Pre Order Traversal: ");
            tree.preorder(root);
            System.out.println("\n In Order Traversal: ");
            tree.inorder(root);
            System.out.println("\n Post Order Traversal: ");
            tree.postorder(root);
        }
    } 
}