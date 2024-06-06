package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class Traversals2 {
    static class Node { 
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
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

        public List<List<Integer>> levelorder(Node root) { // Level Order Traversal = Breadth First Search  =>  TC:O(n)  SC:O(n)
            Queue<Node> queue = new LinkedList<Node>();
            List<List<Integer>> wraplist = new LinkedList<List<Integer>>();
            if(root == null) return wraplist;
            queue.offer(root);
            while(!queue.isEmpty()){
                int levelnum = queue.size();
                List<Integer> sublist = new LinkedList<Integer>();
                for(int i=0;i<levelnum;i++){
                    if(queue.peek().left != null) queue.offer(queue.peek().left);
                    if(queue.peek().right != null) queue.offer(queue.peek().right);
                    sublist.add(queue.poll().val);
                }
                wraplist.add(sublist);
            }
            return wraplist;
        }

        public static void main(String[] args) {
            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; 
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(nodes);
            System.out.println("Pre Order Traversal: ");
            tree.levelorder(root);
        }
    }
}