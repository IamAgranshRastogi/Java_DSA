public class ArrayBasicOp 
{ public static void main(String[] args) 
    {  //Declaration
        int[] a1;      
       
       //Creation
       a1=new int[5];
       int[] a2=new int[4];
       
       //Initialization
       a1[0]=10;
       a2[2]=15;
       
       int[] a3={1,2,3,4};
       int[] a4=new int[]{5,6,7,8};
       
       //Retrieval 
       System.out.println("In array 3");
       for (int i=0;i<a3.length;i++)
       {  System.out.println("Element at "+i+"is :"+ a3[i]);
       }
       
       //Retrieval using For-Each loop
       System.out.println("In array 4");
       for(int i:a4)
       {  System.out.println("Element is:"+i);
       }
    } 
}
