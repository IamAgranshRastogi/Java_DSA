import java.util.Scanner;
public class GCD_LCM
{ public static void main(String[] args) 
  { Scanner s=new Scanner(System.in);
    System.out.println(" Enter Two numbers to find their GCD &  LCM : ");
    System.out.print(" Enter First Number : ");
    int n1=s.nextInt();
    System.out.print("Enter Second Number : ");
    int n2=s.nextInt();
    
    int on1=n1;
    int on2=n2;

    while(n1 % n2 != 0)
    { int rem = n1 % n2;
      n1=n2;
      n2=rem;
    }
    int gcd = n2;
    int lcm=(on1*on2) / gcd;

    System.out.println("GCD : "+gcd);
    System.out.println("LCM : "+lcm);



    s.close();
  }  
}
