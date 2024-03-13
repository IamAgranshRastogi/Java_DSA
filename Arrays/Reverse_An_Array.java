import java.util.Scanner;
public class Reverse_An_Array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=s.nextInt();
        System.out.println("Enter elements of array: ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        revArray(a,n);
        s.close();
    }
    public static void revArray(int a[],int n) {
        int temp=0;
        for(int i=0;i<n/2;i++){
            temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
