import java.util.Scanner;
public class Is_Arr_Sorted
{ 
  public static boolean isSorted(int arr[],int i)
  { if(i==arr.length-1)  //Base Case
    { return true;
    }
    return arr[i]<arr[i+1]&& isSorted(arr,i+1); 
  }

  public static void main(String[] args) 
  { Scanner s=new Scanner(System.in);
    System.out.print("size of array : ");
    int n=s.nextInt();
    System.out.print("Enter arr elements : ");
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    { arr[i]=s.nextInt();
    }
    System.out.print("Array is Sorted : "+isSorted(arr,0));
    s.close();
  }
}