import java.util.Scanner;
public class Lin_Search 
{ public static int Lsearch(int arr[],int target,int index)
  { if(index==-1) 
    { return -1;
    }
    if(arr[index]==target)
    { return index+1 ;
    }
    else
    { return Lsearch(arr,target,index+1);
    }
  } 

  public static void main(String[] args)
  { Scanner s=new Scanner(System.in);
    System.out.print("Enter size of array : ");
    int n=s.nextInt();
    int arr[]=new int[n];
    System.out.print("Enter Array Elements : ");
    for (int i=0;i<n;i++)
    { arr[i]=s.nextInt();
    }
    System.out.print("Element to search : ");
    int target =s.nextInt();
    System.out.print("After Linear Search element found is present on "+Lsearch(arr,target,0)+"th position");
    s.close();
  }
    
}
