package Maths;
import java.util.Scanner;
public class Prime_Num 
{ public static void main(String[] args) 
  { Scanner s=new Scanner(System.in);
    System.out.println("Enter a number to check if it is Prime or not : ");
    int x=s.nextInt(); 
    System.out.println(x+" is Prime : "+ Prime(x));    
    s.close();
  }  
  static boolean Prime(int n)
  { for(int i=2;i<n;i++)
    { if(n % i == 0)
      { return false;
      }
    }
    return true;
  }
}
