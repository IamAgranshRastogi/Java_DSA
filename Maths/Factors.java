import java.util.Scanner;
public class Factors 
{ public static void main(String[] args) 
  { Scanner s=new Scanner(System.in);
    System.out.println("Enter a number to find its factors : ");
    int n=s.nextInt(); 
    System.out.println("Factors are : ");
    factor(n);
    s.close();
  }
  static void factor(int n)
  { 
    System.out.print(1+" ");
    for(int i=1;i<=n;i++)
    { if(n%i==0)
      {  System.out.print(i+" "); 
      }
    }
    System.out.print(n);
  }  
}
//TC:O(n-2)~O(n)
