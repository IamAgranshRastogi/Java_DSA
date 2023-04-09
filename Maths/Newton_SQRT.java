package Maths;
import java.util.Scanner;
// Newton Rophson Method 
// We guess the sqrt of N as X then we 
//try to minimize the error / diffence  b/w X and sqrt(N) 
public class Newton_SQRT 
{ public static void main(String[] args) 
  { Scanner s=new Scanner(System.in);
    System.out.println("Enter a number to find square root : ");
    int a=s.nextInt();
    System.out.println("Square Root : "+sqrt(a));
    s.close();
  } 
  static double sqrt(double n)
  { double x=n;
    double root;
    while(true)
    { root=0.5*( x + (n/x));
      if(Math.abs(root - x) < 0.00001)
      { break;
      }
      x = root;
    }
    return root;
  }
}
// TC: O(logn* F(n))
// F(N)= cost of calculating F(x)/F'(x)
// with some N digit precision