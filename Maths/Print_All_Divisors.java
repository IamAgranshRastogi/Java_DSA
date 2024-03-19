import java.util.Scanner;
public class Print_All_Divisors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to get all divisors of it: ");
        int n = s.nextInt();
        System.out.print("Divisors of number "+n+" are: ");
        // Print_Divisors(n);
        Print_Divisors2(n);
        s.close();
    }
    
    // Brute Force Approach 
    // TC: O(n)  SC: O(1)
    public static void Print_Divisors(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }

    // Optimal Approach
    // TC: O(sqrt(n))  SC:O(1)
    public static void Print_Divisors2(int n){
        for(int i=1;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(i!=n/i)               // To not print sqrt twice
                { System.out.print((n/i)+" ");
                }
            }
        }
    }
}
