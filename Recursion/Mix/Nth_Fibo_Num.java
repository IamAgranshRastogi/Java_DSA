package Mix;
import java.util.Scanner;
public class Nth_Fibo_Num 
{   public static void main(String[] args) 
    { Scanner s=new Scanner(System.in);
      System.out.println("Enter n to find the nth Fibonacci Number : ");
      int x=s.nextInt();
      
      System.out.println(fibo(x));
      
      s.close();
    }
    
    static int fibo(int n)
    {  //Base Condition
        if(n<=1)  return n;
        if(n==2)   return 1;
  
        return fibo(n-1)+fibo(n-2);
    }
    
}


// Inefficient for values bigger than 40  also
// As same part of Recursion Tree will be computed on both sides (left part and right part)

// Here comes in play Dynamic Programming
