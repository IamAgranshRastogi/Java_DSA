package Maths;
import java.util.Scanner;
public class Prime_Num_3 
{ public static void main(String[] args) 
  { Scanner s=new Scanner(System.in);
    System.out.println("Enter a number till which you want to find all numbers are prime or not : "); 
    int n=s.nextInt();
    
    for (int i=1;i<=n;i++)
    { System.out.println(i+" "+ isPrime(i));   
    }  
  s.close();
  }
  static boolean isPrime(int n) // Time Comp : O[sqrt(n)]
  { if(n<=1)   // base condition
    { return false;
    }
    int c=2;   // check from 2
    while(c*c <= n) // checking for all square roots small/equal to number
    { if(n % c == 0)  // if any number till sqr root of Number is a factor of number
      { return false;  // if Factor then not prime
      }
      c++; 
    }
    return true; // otherwise only 2 factors 1 & itself for which loop is not traversing
  }   
}

