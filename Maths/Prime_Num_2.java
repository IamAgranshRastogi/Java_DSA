package Maths;
import java.util.Scanner;
public class Prime_Num_2 
{ public static void main(String[] args) 
  { Scanner s=new Scanner(System.in);
    System.out.println("Enter a number till which you want to find all numbers are prime or not : "); 
    int n=s.nextInt();
    for (int i=1;i<=n;i++)
    { System.out.println(i+" "+ isPrime(i));   
    }  
    s.close();
  }
  static boolean isPrime(int n) // tc : (n)^1/2
  { if(n<=1)
    { return false;
    }
    int c=2;
    while(c*c <= n)
    { if(n % c == 0)
      { return false;
      }
      c++;
    }
    return true;
  }   
}

