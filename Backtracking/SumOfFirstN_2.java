package Backtracking;
import java.util.Scanner;

//Functional way (Making T(n) )
public class SumOfFirstN_2 
{  public static void main(String[] args) 
  { Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    System.out.println(SumOfN(n));  // Print return value    
    s.close();
  }  
  static int SumOfN(int i)
  { if(i==0) return 0; // Base Case 
    
    return i + SumOfN(i-1);  // return sum + child func return value
  }
}
