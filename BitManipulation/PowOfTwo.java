import java.util.Scanner;
public class PowOfTwo 
{  public static void main(String[] args) 
   { Scanner s= new Scanner(System.in);
     System.out.println("Enter any number to check whether it is a power of 2 or not : ");
     int n=s.nextInt(); // note: fix for n=0
     boolean ans =(n & (n-1))==0;
     System.out.println(ans);
     s.close();
   }
}
 