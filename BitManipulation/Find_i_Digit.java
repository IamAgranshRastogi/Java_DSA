package BitManipulation;
public class Find_i_Digit
{ public static void main(String[] args) 
  {  int n=11;
     int i=3;
     System.out.println(ans(n,i)) ;

  }
  private static int ans(int n,int i)
  { 
    return (n ^ (1<<(n-1)));
  }
}