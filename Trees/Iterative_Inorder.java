package Trees;

import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

public class Iterative_Inorder {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){ this.val = val; }
        Node(int val, Node left, Node right) { 
            this.val=val;
            this.left = null;
            this.right= null;
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

        // TC:O(n)      SC:O(n)
        public List<Integer> Inorder(Node root){
            List<Integer> inorder = new ArrayList<Integer>();
            Stack<Integer> stack = new Stack<>();
            Node node = root;
            while(true){
                if(node!=null){
                    stack.push(node);
                    node=node.left; 
                }
                else{
                    if(stack.isEmpty()){
                        break;
                    }
                    node = stack.pop();
                    inorder.add(node.val);
                    node = node.right;
                }
            }
            return inorder;
        }

        // TC:O(n)      SC:O(n)
        public List<Integer> Postorder(Node root){
            Stack<Node> st1 = new Stack<>();
            Stack<Node> st2 = new Stack<>();
            List<Integer> postorder = new ArrayList<>();
            if(root==null)  return postorder;
            st1.push(root);
            while(!st1.isEmpty()){
                root = st1.pop();
                st2.add(root);
                if(root.left != null) st1.push(root.left);
                if(root.right != null) st1.push(root.right);
            }
            while(!st2.isEmpty()){
                postorder.add(st2.pop().val);
            }
            return postorder;
        }

        public static void main(String[] args) {
            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; 
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(nodes);
            System.out.println("Inorder Traversal: ");
            tree.Inorder(root);
        }
    }
}