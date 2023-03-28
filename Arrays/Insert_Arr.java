import java.util.*;
public class Insert_Arr 
{   static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    { int a[]=new int[5];
     /*a[0]=12;
      a[1]=34;
      a[2]=15;
      a[3]=67;
      a[4]=48;
     */
    
    for(int j=0;j<a.length;j++)
    { a[j]=sc.nextInt();
    }
    System.out.println("New Array is :");
    for(int i=0;i<a.length;i++)
    { System.out.print(a[i]+" ");
    }
    }
}
