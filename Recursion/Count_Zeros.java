import java.util.Scanner;
public class Count_Zeros 
{ public static void main(String[] args) 
  { Scanner s =new Scanner(System.in);
    System.out.print("Enter a num : ");
    int n = s.nextInt(); 
    System.out.print("Num of zeros in num are : "+count_Zero(n));
    s.close();
  }
  static int count_Zero(int n)
  {  return helper(n,0);
  }
  private static int helper(int n,int c)
  { if(n==0)
    { return c;
    }
    int rem = n%10;
    if(rem==0)
    { return helper(n/10,c+1);
    }
    return helper(n/10,c);
  }
}
 
