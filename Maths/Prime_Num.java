package Maths;
import java.util.Scanner;
public class Prime_Num 
{ public static void main(String[] args) 
  { Scanner s=new Scanner(System.in);
    System.out.println("Enter a number to check if it is Prime or not : ");
    int x=s.nextInt();
    Prime(x);
    s.close();
  }  
  static void Prime(int n)
  { int c=0;
    for(int i=2;i<n;i++)
    { if(n % i == 0)
      { System.out.println("Not Prime Number");
        c=1;
        break;
      }
    }
    if(c==0)
    { System.out.println("Prime Number");
    }
  }
}
