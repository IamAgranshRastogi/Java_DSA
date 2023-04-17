public class CallEmpty_arr
{ public static void main(String[] args) 
 { int s=5;
    System.out.println("Elements of Array from 0 to 5 : ");
   ArrayPrint(new int[s]);    //Calling Function with Empty arr declaration
 }
 public static void ArrayPrint(int arr[])
 { for(int i=0;i<arr.length;i++)
    { arr[i]=i+1;
    }
    for(int i=0;i<arr.length;i++)
    {  System.out.print(arr[i]+" ");
    }
 }
}