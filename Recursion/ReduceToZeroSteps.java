import java.util.Scanner;
public class ReduceToZeroSteps 
{ public static void main(String[] args) 
  { Scanner s=new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n =s.nextInt();
    System.out.println(numberOfSteps(n));
    s.close();
  }  
  public static int numberOfSteps(int num)
  { return helper(num,0);
  }
  private static int helper(int num,int steps)
  { if(num==0)  //base case
    {  return steps;
    }
    if(num%2==0) // For n : (even)
    { return helper(num/2,steps+1);
    }  // For odd
    return helper(num-1,steps+1);
  }
}
