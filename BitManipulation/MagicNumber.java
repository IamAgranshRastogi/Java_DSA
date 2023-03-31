package BitManipulation;

import java.util.Scanner;
public class MagicNumber  
{ public static void main(String[] args) 
  { Scanner s=new Scanner(System.in);
    System.out.println("Enter i for finding ith Magic Number :");
    int n=s.nextInt();  // i

    int ans=0;  
    int base=5;  // Base number for finding magic number
    while(n>0)   // powers of 5 start from 1 not 0
    {  int last = n & 1; // And of number , 1
       n= n>>1;          // right shift 1
       ans += last * base;  // multiplying bit with 5
       base= base*5;  // increasig  power of 5
    }
     System.out.println(ans);
    s.close();
  }
}
