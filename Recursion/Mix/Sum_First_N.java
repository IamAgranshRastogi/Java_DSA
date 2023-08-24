package Mix;


// Parameterised Recursion

class Sum_First_N
{ 
  // Parameterised Recursion
  public static void Parameterised_Sum(int i,int sum)
  { if(i<1)
    { System.out.println(sum);
      return;
    }
   Parameterised_Sum(i-1,sum+i);
  }
  
  //  Functional Recursion
  public static int Functional_Sum(int m)
  { if(m==0)
    { return 0;
    }
    return m + Functional_Sum(m-1);
  }

  public static void main(String[] args) 
  { int n=10;
    System.out.print("Sum till n is :");
    Parameterised_Sum(n,0);

    System.out.print("Sum till n is :");
    System.out.print(Functional_Sum(n));
  }
}