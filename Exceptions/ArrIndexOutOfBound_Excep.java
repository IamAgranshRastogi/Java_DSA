public class ArrIndexOutOfBound_Excep 
{ public static void main(String[] args) 
 { int[] a=new int[5];
    a[0]=10;
    a[1]=50;
    a[2]=20;
    a[3]=40;
    a[4]=30;
  // Five elements inserted : array is full
    
    a[5]=90;
    // This will throw array index out of bound exception
 }   
}
