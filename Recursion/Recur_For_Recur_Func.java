package Recursion;

public class Recur_For_Recur_Func 
{   public static void main(String[] args) 
    {  
      func1(1);
    }
    static void func1(int n)
    {   if(n==5)
        {  System.out.println(5);
           return;
        }
        System.out.println(n);
        func1(n+1);
    }
}
