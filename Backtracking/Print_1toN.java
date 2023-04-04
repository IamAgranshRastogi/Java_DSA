package Backtracking;

import java.util.Scanner;
public class Print_1toN 
{ public static void main(String[] args) 
  { Scanner s=new Scanner(System.in);
    System.out.println("Enter a num to print values from 1 till that number : ");
    int n=s.nextInt();
    Printf(n,n);  // initial functn call 
    s.close(); 
  } 
  static  void Printf(int i,int n)
  { if(i<1) return ;  // Base Case for Btrack

    Printf(i-1,n);  // calling the subchild func

    System.out.println(i); // operation after every backtrack 
  }
}
