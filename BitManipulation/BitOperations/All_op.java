package BitOperations;

import java.util.Scanner;

// Ques) ->  
// You are given a number 'n'.
// Print num on Setting its i-th bit.
// Print num on Unsetting its j-th bit.
// Print num on Toggling its k-th bit. 
// Also, Check if its m-th bit is on/off. Print true if it is on, otherwise print false.  



public class All_op 
{  public static void main(String[] args) 
   { 
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int i=s.nextInt();
    int j=s.nextInt();
    int k=s.nextInt();
    int m=s.nextInt();

    int onmask= (1<<i);
    int offmask= -(1<<j);
    int tmask= (1<<k);
    int cmask= (1<<m);

    System.out.println(n | onmask);
    System.out.println(n & offmask);
    System.out.println(n ^ tmask);
    System.out.println(((n & cmask)==0) ? false :true);
    s.close();
   }
    
}
