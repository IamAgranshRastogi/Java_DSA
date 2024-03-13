import java.util.Scanner;
public class Missing_Ele_in_Arr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=s.nextInt();
        System.out.println("Enter elements of array: ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        MissingElement(a,n);
        s.close();
    }

    // **********Brute Force Approach**********
    // TC: O(nlogn)   SC: O(n)
    // public static void MissingElement(int[] a,int n) {
    //     Arrays.sort(a);
    //     for(int i=0;i<n;i++){
    //         if(a[i]!=i+1)
    //         {  System.out.println("Missing Element :"+ (i+1));
    //            break;
    //         }
    //     }
    // }


    // **********Better Approach************
    // TC:O(n)   SC:O(n) 
    // Summation of elements for large array can make it go out of range

    // public static void MissingElement(int a[],int n){
    //     int sum =n*(n+1)/2;
    //     int tot=0;
    //     for(int i=0;i<n;i++){
    //         tot += a[i];
    //     }
    //     System.out.println("Missing Element :"+(tot-sum));
    // }


    // ********Optimized Approach**********
    // TC:O(n)   SC: O(n)
    
    public static void MissingElement(int a[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum += (i+1);
            sum -= a[i];
            if(sum != 0){
                sum = i+1;
                break;
            }
        }
        System.out.println("Missing Element: "+sum);
    }
}
