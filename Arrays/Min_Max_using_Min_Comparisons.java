import java.util.Scanner;
public class Min_Max_using_Min_Comparisons {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=s.nextInt();
        System.out.println("Enter elements of array: ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        Min_Max_in_Arr(a,n);
        s.close();
    }
    public static void Min_Max_in_Arr(int a[],int n) {
        int i,max,min;
        if(n%2==0){
            if(a[0]>a[1]){ max=a[0];  min=a[1];}
            else{ min=a[0]; max=a[1]; }
            i=2;
        }
        else{ min=a[0]; max=a[1]; i=1; }
        while(i<n-1){
            if(a[i]>a[i+1]){
                if(a[i]>max) max=a[i];
                if(a[i+1]<min) min=a[i+1];
            }
            else{
                if(a[i+1]>max) max=a[i+1];
                if(a[i]<min)  min=a[i];
            }
            i += 2;
        }
        System.out.println("Max Element: "+max);
        System.out.println("Min Element: "+min);
    }
}
