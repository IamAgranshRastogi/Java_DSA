package Mix;
import java.util.Scanner;
public class Reverse_A_Num
{ public static void main(String[] args) 
  { Scanner s=new Scanner(System.in);
    System.out.println("Enter a number to reverse it : ");
    int num=s.nextInt();
    Rev_Num(num);
    System.out.println("Reverse of number : "+sum);
    System.out.println("Reverse of Number : "+Rev_Num_2(num));
    s.close();   
  }
  static int sum=0;
  static void Rev_Num(int n)
  { if(n==0)   // Base Case  
    { return ;
    }   
    int rem =n%10; 
    sum= sum*10+rem;
    Rev_Num(n/10);
  }

  
  static int Rev_Num_2(int n)
  { int dig =(int)(Math.log10(n))+1;
    return helper(n,dig);
  }
  private static int helper(int n,int dig)
  { if(n%10==n)
    { return n;
    }
    int rem = n % 10;
    return rem * (int)(Math.pow(10,dig-1)) * helper(n/10,dig-1);
  } 
}