import java.util.Arrays;
public class Reverse_Array 
{ public static void Functional_Reversal(int i,int arr[],int n)
  { if(i>= n/2)
    {   System.out.print(Arrays.toString(arr));
        return ;
    }
    int temp=0;
    
    //Swapping a[i] with a[n-i-1]
    temp=arr[i];
    arr[i]=arr[n-i-1];
    arr[n-i-1]=temp;
    

    Functional_Reversal(i+1,arr,n);
  }

  public static void main(String[] args) 
  {  int arr[]={10,20,30,40,50};
    System.out.print("Reversed Array");
    // Functional Recursion
    Functional_Reversal(0,arr,arr.length);  
  }   
}
