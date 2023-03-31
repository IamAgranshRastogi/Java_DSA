package BitManipulation;

import java.util.Scanner;
public class A_Power_B
{ public static void main(String[] args) 
  { Scanner s=new Scanner(System.in);
    
    System.out.println("Enter Base : ");
    int base=s.nextInt();
    
    System.out.println("Enter Exponent : ");    
    int pow =s.nextInt();  

    int ans=1;  // ans
    while(pow > 0)
    { if((pow & 1)==1) // checking if base AND 1 == 1 
      { ans *= base;    
      }               // no need for multiplyingbase with  0 bit and adding it to base
      base *= base;   // increasing pow index of base for bit multiplication  
      pow = pow>>1;  // right shifting 1 in pow
    }

    System.out.println("Base ^ Pow : "+ ans);
    s.close();
  }
}

