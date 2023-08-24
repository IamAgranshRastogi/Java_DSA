package Mix;
import java.util.Scanner;
public class Nto1 
{ public static void main(String[] args)  
  { Scanner s=new Scanner(System.in);
    System.out.println("Enter a number : ");
    int x=s.nextInt(); 
    System.out.println("Numbers from 1 are : ");
    fun(x); 
    System.out.println("Numbers till 1 are : ");
    funRev(x);
    s.close();   
  } 
  static void funRev(int n)
  { if(n==0)
    { return;
    }
    System.out.print(n+ " ");
    funRev(n-1);
  }
  static void fun(int n)
  { if(n==0)
    { return;
    }
    fun(n-1);
    System.out.print(n+" ");   
  }
}
