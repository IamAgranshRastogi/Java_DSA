import java.util.Scanner;
public class Sum_n_Pro_Of_Digits 
{ public static void main(String[] args) 
  { Scanner s=new Scanner(System.in); 
    System.out.print("Enter a number to find sum of its digits : ");
    int num=s.nextInt(); 
    System.out.println("Sum of Digits of number is : "+ Sum_Digit(num));
    System.out.println("Product of Digits of number is : "+ Product_Digit(num));
    s.close();
  }  
  static int Sum_Digit(int n)
  { if(n==0)
    { return 0;
    }
    return n%10 + Sum_Digit(n/10);
  }
  static int Product_Digit(int n)
  { /*if(n==0)
    { return 0;
    }
    if(n==1)
    { return 1;
    }*/
    if(n%10==n)
    { return n;
    }
    return n%10 * Product_Digit(n/10);
  }
}

