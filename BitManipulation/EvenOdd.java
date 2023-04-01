import java.util.Scanner;
public class EvenOdd 
{ public static void main(String[] args) 
  { Scanner s=new Scanner(System.in);
    System.out.println("Enter Number to check if it is Odd / Even : ");
    int n=s.nextInt();
    boolean x= isOdd(n);
    if(x==false)
    {  System.out.println("even");
    }
    else
    {  System.out.println("odd");
    }
    s.close();
  }  
  private static boolean isOdd(int n)
  {
    return (n&1)==1;
  }
}
