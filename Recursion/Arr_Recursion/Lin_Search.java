public class Lin_Search 
{ 
  // To print only first occurence of target
  public static int Lsearch(int arr[],int target,int index)
  { if(index==-1) 
    { return -1;
    }
    if(arr[index]==target)
    { return index ;
    }
    else
    { return Lsearch(arr,target,index+1);
    }
  }


  
  public static void main(String[] args)
  { int arr[] = {23,34,54,34,56,65};
    int target=34;
    System.out.print("After Linear Search element found is present on "+ Lsearch(arr,target,0)+"th index");
  }
}
