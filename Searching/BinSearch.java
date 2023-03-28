package Searching;
import java.util.Scanner;
public class BinSearch
{ public static void main(String[] args) 
    { int a[]={10,20,30,40,50}; //Sorted array
      Scanner s=new Scanner(System.in);
      System.out.println("Enter element to be searched :");
      
      int srch=s.nextInt();
      int low=0;
      int high=a.length-1;
      int mid=(low + high)/2;
      
      while(low<=high)
      { if(a[mid]==srch)
        { System.out.println("Element is at "+mid+" index position");
          break;    
        }
        else if(a[mid]<srch)
        { low=mid+1;
        }
        else 
        { high=mid-1;
        }
        mid=(low + high)/2;
      }
      if(low > high)
      {System.out.println("Element not Found");
      }
      s.close();
    }
}