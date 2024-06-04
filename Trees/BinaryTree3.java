package Trees;

public class BinaryTree3{
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
  public class Count_Nodes {
    public static int count(Node1 root){
        if(root == null){
            return 0;
        }
        int leftcount = count(root.left);
        int rightcount = count(root.right);
        return leftcount + rightcount + 1;
    }
  }
}

  
