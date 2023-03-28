package Sorting;
import java.util.Scanner;

    public class InsertionSortStr
    {
        public static void main(String[] args)
        {   Scanner s=new Scanner(System.in);
            System.out.println("Enter number of elements :");
            int size=s.nextInt();
            String[] a=new String[size];
            System.out.println("Enter elements: ");
            for(int i=0;i<size;i++)
            {
                a[i]=s.next();
            }

            //******************INSERTION SORT starts here*******************

            String temp;
            int j;    // temp for choosing no.  , j for sorted array creation
            for(int i=1;i<size;i++)     // loop to start from KEY and check till last element
            {
                temp=a[i];       // assigning 2nd elemnt to temp (keep changing till last
                j=i;              //
                while(j>0 && a[j-1].compareTo(temp)>0)   //loop to shift elems right after xchngng elem at its correct index
                {
                    a[j]=a[j-1];
                    j=j-1;
                }
                a[j]=temp;    //putting current elem to desired correct index
            }
            System.out.println("Sorted list of elements is : ");
            for( j=0;j<size;j++)
            {
                System.out.println(a[j]);
            }
        }
    }

