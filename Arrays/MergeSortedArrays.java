import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array1: ");
        int m=s.nextInt();
        System.out.println("Enter elements of array1: ");
        int a[]=new int[m];
        for(int i=0;i<m;i++){
            a[i]=s.nextInt();
        }
        System.out.println("Enter size of array2: ");
        int n=s.nextInt();
        System.out.println("Enter elements of array2: ");
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            b[i]=s.nextInt();
        }
        int merged[]=MergeSorted_Arrays(a,m,b,n);
        System.out.print("Merged Sorted Array: ");
        for(int k=0;k<m+n;k++){
            System.out.print(merged[k]+" ");
        }
        s.close();
    }
    public static int []MergeSorted_Arrays(int a[],int m,int b[],int n) {
        int merged[] = new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
           if(a[i]<b[j]){
            merged[k++] = a[i++];
           }
           else{
            merged[k++] = b[j++];
           }
        }
        while(i<m){
            merged[k++] = a[i++];
        }
        while(j<n){
            merged[k++] = b[j++];
        }
        return merged;
    }
}
