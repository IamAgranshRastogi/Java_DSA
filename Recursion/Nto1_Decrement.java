import java.util.Scanner;
public class Nto1_Decrement 
{ public static void main(String[] args) 
  { Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    fun(num);
    s.close();  
  }  
  static void fun(int n)
  { if(n==0)
    { return;
    }
    System.out.println(n);
    //fun(n--); Infinite Loop as it will call fun(n) again first then decrement(no use)
    fun(--n); // this will call fun(n-1)
  }
}
