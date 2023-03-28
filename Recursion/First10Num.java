package Recursion;

public class First10Num
{
    /*public static void main(String[] args) 
    { print1(1);
      print1(2);
      print1(3);
      print1(4);
      print1(5);


      for(int i=6;i<11;i++)
      { print1(i);
      }

    }
    static void print1(int n)
    { System.out.println(n);
    }   */
    
    public static void main(String[] args) 
    { print1(1);
    }
    static void print1(int n)
    { System.out.println(n);
      print2(2);
    }
    static void print2(int n)
    { System.out.println(n);
      print3(3);
    }
    static void print3(int n)
    { System.out.println(n);
      print4(2);
    }
    static void print4(int n)
    { System.out.println(n);
      print5(2);
    }
    static void print5(int n)
    { System.out.println(n);
    } 
}