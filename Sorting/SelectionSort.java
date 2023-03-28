package Sorting;
import java.util.Scanner;
public class SelectionSort
{
    public static void main(String[] args)
    {   Scanner s=new Scanner(System.in);
        System.out.println("Enter number of elements :");
        int size=s.nextInt();
        int[] a=new int[size];
        System.out.println("Enter elements: ");
        for(int i=0;i<size;i++)
        {
             a[i]=s.nextInt();
        }
        // ************ SELECT SORT starts here**************************

        int min;     // var to check for smallest element
        int temp=0;                  // var for swapping
        for(int i=0;i<size;i++)
        {  min=i;
            for(int j=i+1;j<size;j++)        //to  check right side remaining elemnts for smallest
            {   if(a[j]<a[min])         //shift index to rightside element if  smaller than current
                {    min=j;
                }
            }
            temp=a[i];                      // swapping current element
            a[i]=a[min];                    // with smallest rightside
            a[min]=temp;                    // element found
        }
        System.out.println("sorted list of elements :");
        for(int i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }
        s.close();
    }
}