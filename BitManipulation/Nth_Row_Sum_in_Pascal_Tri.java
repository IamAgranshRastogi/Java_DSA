import java.util.Scanner;
public class Nth_Row_Sum_in_Pascal_Tri
{ public static void main(String[] args) 
  { Scanner s=new Scanner(System.in); 
    System.out.println("Enter Number : ");
    int n=s.nextInt();
    System.out.println("Sum of Nth Row in Pascal's Triangle : "+ ans(n));
    s.close();
  }  
  static int ans(int n)
  { // Sum of Nth Row = nC0 + nC1 + nC2 +...nCn = 2^(n-1)
    // 1 left shift (n-1) = 1* 2^(n-1) 
    return 1<<(n-1);
  }
}
