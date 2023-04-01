import java.util.Scanner;
public class NumOfDigits 
{ public static void main(String[] args) 
  { Scanner s=new Scanner(System.in);
    System.out.println("Enter Number : ");
    int n= s.nextInt();
    System.out.println("Enter Base : ");
    int base=s.nextInt();
    
    int ans= (int)(Math.log(n)/Math.log(base)) + 1;

    System.out.println(ans);
    s.close();
  }  
}

// log base (n)= log x (n) /log x (base)
//             = log 10 n / log 10 (base)
//             = log n / log base

// Time Complexity : O(log n)