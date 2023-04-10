import java.util.ArrayList;
import java.util.Scanner;
public class Factors2 
{ public static void main(String[] args) 
  { Scanner s=new Scanner(System.in);
    System.out.println("Enter a number to find its factors : ");
    int a=s.nextInt();
    
    System.out.println("Factors are : ");
      sortedfactors(a); 
      //factors(a);
    s.close();
  }
  static void sortedfactors(int n)
  { ArrayList<Integer> list=new ArrayList<>();
    for(int i=1;i<=Math.sqrt(n);i++)
    {  if(n % i == 0)
       {  if(n/i ==i)
          { System.out.print(i+" ");
          }
          else
          { System.out.print(i+" ");
            list.add(n/i);
          }
       }
    }
    for(int i=list.size()-1;i>=0;i--)
    { System.out.print(list.get(i)+" ");
    }
  }
}
//Sorted Output : 1 2 4 8 16 20 25 50 100 200 400


// This will give factors in unsorted way
    
  // ex: for n=400   |  Op: 1 400 2 200 4 100 8 50 16 25 20  


/*
  static void factors(int n)
  { for(int i=1;i<=Math.sqrt(n);i++)
    { if(n%i==0)
      { if(n/i==i)
        { System.out.print(i +" ");
          break;
        }
        else
        { System.out.print(i +" "+ n/i +" ");
        }
      }
    }
  } 
  */
  