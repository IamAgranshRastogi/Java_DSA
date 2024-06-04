package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinTree1Traversal{
    static class Node1{ 
        int data;
        Node1 left;
        Node1 right;

        Node1 (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    static class BinaryTree{
        static int idx = -1;
        public static Node1 buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node1 newNode = new Node1(nodes[idx]); 
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorder(Node1 root){  //Root Left Right
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void postorder(Node1 root){ //Left Right Root
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        public static void levelorder(Node1 root){   //Inorder: Left Root Right
            if(root==null){
                return;
            }
            Queue<Node1> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node1 currNode1 = q.remove();
                if(currNode1 == null){
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode1.data+" ");
                    if(currNode1.left != null){
                        q.add(currNode1.left);
                    }
                    if(currNode1.right != null){
                        q.add(currNode1.right);
                    }
                }
            }
        }

        public static void main(String args[]){
          int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; 
          BinaryTree tree = new BinaryTree();
          Node1 root = tree.buildTree(nodes);
          System.out.println("Pre Order Traversal: ");
          tree.preorder(root);
          System.out.println("\nPost Order Traversal: ");
          tree.postorder(root);
          System.out.println("\nLevel Order Traversal");
          tree.levelorder(root);
        }
    } 
}