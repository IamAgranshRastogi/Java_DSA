package Mix;
public class Factorial_N 
{  public static void Parameterised_Factorial(int n,int f)
    {   if(n==0)
        {  System.out.println(1);
            return; 
        }
        else if(n==1)
        { System.out.print(f);
            return;
        }
        Parameterised_Factorial(n-1,f*n);
    }
    
    public static int Functional_Factorial(int n)
    {   if(n==0||n==1)
        { return 1;
        }
        return n*Functional_Factorial(n-1);
    }

    public static void main(String []args)
    {  int n=6;
       System.out.print("Factorial of N is: ");
       Parameterised_Factorial(n,1);


       System.out.print("\n Factorial of N is: ");
       System.out.print(Functional_Factorial(n));
    }
}
