package Trees;

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode (){}
    TreeNode(int data){  this.data=data; }
    TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
public class Traversals {
    
    // TC: O(n)  SC:O(n)
    public List<List<Integer>> LevelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> wrapList = new LinkedList<>();
        if(root == null) return wrapList;
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<>();
            for(int i=0; i<levelNum; i++){
                if(queue.peek().left != null)    queue.offer(queue.peek().left);
                if(queue.peek().right != null)   queue.offer(queue.peek().right);
                subList.add(queue.poll().data);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }

    
    // TC: O(n)  SC: O(n)
    public List<Integer> PreOrder(TreeNode root){
        List<Integer> preorder = new ArrayList<Integer>();
        if(root == null) return preorder;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){ 
            root = st.pop();
            preorder.add(root.data);
            if(root.right != null){
                st.push(root.right);
            }
            if(root.left != null){
                st.push(root.left);
            }
            return preorder;
        }
    }   
}
