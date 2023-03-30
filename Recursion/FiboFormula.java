import java.util.Scanner; 
public class FiboFormula 
{  public static void main(String[] args) 
   { Scanner s=new Scanner(System.in);
    System.out.println("Enter N to find Nth Fibonacci Number and its complexity : ");
    int x=s.nextInt();  
    System.out.println("Time Complexity to find it is :" + FiboForm(x));
    System.out.println("Nth Fibonacci Number : "+ fibo(x));
    s.close();
   }
   static int FiboForm(int n)
   {  return (int) (Math.pow((1+Math.sqrt(5)) /2 , n )/ Math.sqrt(5));
   }
   static int fibo(int n)
   { if(n<2)
     { return n;
     }
     return fibo(n-1) + fibo(n-2);
   }
}
