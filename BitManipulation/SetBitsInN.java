import java.util.Scanner;

class SetBitsInN
{ public static void main(String[] args) 
  {  Scanner s=new Scanner(System.in);
     System.out.println("Enter Number to check no. of Set bits in it : "); 
     int x = s.nextInt();
     System.out.println(Integer.toBinaryString(x));
     
     System.out.println(setBits(x));
     s.close();
  }
  private static int setBits(int n)
  { int count=0;
    while(n>0)   
    { count++;
      n -= (n & (-n));
    }
    return count;
  }
}


//( n & (-n)) will give ( all 0 only last bit 1 ) 
// n - ( n & (-n)) = will give 