package Sorting;
import java.util.Scanner;
public class BubbleSort
{ 
    public static void main(String[] args)
    {   Scanner s=new Scanner(System.in);
        System.out.print("Enter number of elements to be sorted :");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements :");
        for(int i=0;i<n;i++)
        {   a[i]=s.nextInt();
        }
        // ************Main BUBBLE SORT CODE STARTS HERE*************
        int temp;
        for(int i=0;i<n;i++)
        {   int flag=0;
            for(int j=0;j<n-1-i;j++)
            {   if(a[j]>a[j+1])
               {  temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
                  flag=1;
               }
            }
            if(flag==0)
            { break;
            }
        }
        System.out.println("After Bubble Sort : ");
        for(int j=0;j<n;j++)
        {
            System.out.println(a[j]);
        }
        s.close();
    }
}