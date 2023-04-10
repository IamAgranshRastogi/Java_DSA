import java.util.Scanner;
//Usual Approach         
//Time Comp: O(n)
public class Prime_Num 
{ public static void main(String[] args) 
  { Scanner s = new Scanner (System.in);
    System.out.println("Enter a number : ");
    int n = s.nextInt();
    Prime(n);
    s.close();
  }
  static void Prime(int n)
  { int c=0;
   for(int i=1;i<=n;i++)
   { if(n%i==0) 
    {c++;}
   }
   if(c==2)
   { System.out.println(n+" is a Prime Number");
   }
   else
   { System.out.println(n+" is not a Prime Number ");
   }
  }
}
