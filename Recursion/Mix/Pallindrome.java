package Mix;
import java.util.Scanner;
public class Pallindrome 
{ public static void main(String[] args) 
  { Scanner s=new Scanner(System.in);
    System.out.println("Enter a num to check if it is Pallindrome or not : ");
    int num=s.nextInt();
    System.out.println("Pallindrome : "+Pallin(num));
    s.close(); 
  }
  static boolean Pallin(int n)
  { return n == Rev(n);
  } 

  static int Rev(int n)
  { int digits=(int)(Math.log10(n))+1;
    return helper(n,digits);
  }
  private static int helper(int n,int digits)
  { if(n%10==n)
    {return n;
    }
    int rem=n%10;
    return rem* (int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
  }
}
