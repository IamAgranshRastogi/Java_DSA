import java.util.ArrayList;

public class Lin_Search5
{  public static void main(String[] args) 
    {
      int[] arr={12,34,56,34,87,34};
      int target=34;
      System.out.println(CommonListAns(arr, target, 0));
    }
    static ArrayList<Integer> ls=new ArrayList<>();
    static ArrayList<Integer> CommonListAns(int arr[],int target,int index)
    {  if(arr[index]==arr.length)
       { return ls; }  //Base case

       if(arr[index]==target)
       { ls.add(index);
       }
       ArrayList<Integer> ans=CommonListAns(arr,target,index+1);
       ls.addAll(ans);
       return ls;
    }
}