import java.util.ArrayList;
// return ArrayList of indexes at which element is found
public class Lin_Search3 
{ public static void main(String[] args) 
  { int arr[] = {23,34,54,34,56,65};
    int target=34;
    System.out.println("Present at Index : "+ ListofElements(arr,target,new ArrayList<>(),0));
  }
  public static ArrayList<Integer> ListofElements(int arr[],int target,ArrayList<Integer> ls2,int index)
   {  if(index==arr.length)
     { return ls2;
     }
     if(arr[index]==target)
     { ls2.add(index);
     }
     return ListofElements(arr, target, ls2, index+1);     
   }  
}
