import java.util.ArrayList;
public class Lin_Search2 
{ 
  // To print all index of array
  static ArrayList<Integer> ls=new ArrayList<>();
  public static void AllIndex(int arr[],int target,int index)
  { if(index==arr.length) 
    { return;
    }
    if(arr[index]==target)
    { ls.add(index);
    }
    AllIndex(arr,target,index+1);
  } 

  public static void main(String[] args) 
  { int arr[] = {23,34,54,34,56,65};
    int target=34;   
    System.out.print("After Linear Search element found is present on :");
    AllIndex(arr,target,0);
    System.out.println(ls);
  }
}
