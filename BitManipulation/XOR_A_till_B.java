import java.util.Scanner;
public class XOR_A_till_B
{ public static void main(String[] args) 
  { // range XOR for a,b = XOR(b) ^ XOR(a-1)
    Scanner s=new Scanner(System.in);
    System.out.println("Enter initial value : ");
    int a=s.nextInt();
    System.out.println("Enter final value : ");
    int b=s.nextInt();

    int ans = xor(b)^xor(a-1);
    System.out.println(ans);

    int ans2 = 0;
   
    //only for checking which will give TimeLimExceed for large numbers
    for(int i=a;i<=b;i++)
    { ans2 ^= i;
    }
    System.out.println(ans2);
  }
  static int xor(int a)
  { if(a%4==0)
    { return a; 
    }
    if(a%4==1)
    { return 1; 
    }
    if(a%4==2)
    { return a+1; 
    }
    return 0;
  }
}