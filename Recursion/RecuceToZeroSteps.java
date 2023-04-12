import java.util.Scanner;
public class RecuceToZeroSteps 
{ public static void main(String[] args) 
  { Scanner s=new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n =s.nextInt();
    System.out.println(numberOfSteps(n));
  }  
  public static int numberOfSteps(int num)
  { return helper(num,0);
  }
  private static int helper(int num,int steps)
  { if(num==0)
    {  return steps;
    }
    if(num%2==0)
    { return helper(num/2,steps+1);
    }
    return helper(num-1,steps+1);
  }
}
