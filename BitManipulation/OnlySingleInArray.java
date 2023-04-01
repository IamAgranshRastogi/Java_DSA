public class OnlySingleInArray 
{  public static void main(String[] args) 
   {  int a[]={1,2,3,4,5,4,1,3,5};
     System.out.println(ans(a)); 
   }
   private static int ans(int []a)
   { int uniq=0;
     for(int n:a)
     { uniq ^= n;
     }
     return uniq;
   }
}
