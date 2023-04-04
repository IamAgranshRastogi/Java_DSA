package Backtracking;
import java.util.Scanner;
// Parameterised way
public class SumOfFirstN 
{ public static void main(String[] args) 
  { Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    SumOfN(n,0); //initial call
    s.close();
  }  
  static void SumOfN(int i,int sum)
  {  if(i<1)  // Base Case
    { System.out.println(sum); // print
      return; // backtrack updated sum value
    }
    SumOfN(i-1,sum+i);  // recursion call
  }
}
