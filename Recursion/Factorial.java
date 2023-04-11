import java.util.Scanner;
public class Factorial 
{  public static void main(String[] args) 
   { Scanner s= new Scanner(System.in);
     int num =s.nextInt();  
     System.out.print("Factorial : "+ factorial(num));
     s.close();
   }    
   static int factorial(int n)
   { if(n<=1) //for 0 and 1 , also to return to (n==2)
     { return 1;
     } 
     return n*factorial(n-1);
    }
}
