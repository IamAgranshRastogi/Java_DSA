import java.util.Scanner;
public class Sum_N_num {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number till which u want sum: ");
        int n=s.nextInt();
        // solve_recur(n,0);
        // solve(n);
        // solve2(n);
        System.out.print("Sum from 0 till "+n+" is: "+solve_recur2(n));

        s.close();
    }
    

    // Parameterised Recursive Way
    // TC:O(n)   SC:O(n)
    public static void solve_recur(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        solve_recur(i-1,sum+i);
    }

    // Functional Recursive Way
    // TC: O(n)  SC:O(n)
    public static int solve_recur2(int n){
        if(n==0)
        { return 0;
        }
        return n+ solve_recur2(n-1);
    }
    

    // TC: O(n)   SC:O(n)
    public static void solve(int n) {
        int sum = 0;
        for (int i=1;i<=n;i++) {
          sum += i;
        }
        System.out.println("The sum of the first " + n + " numbers is: " + sum);
    }


    // TC: O(1)  SC:O(1)
    public static void solve2(int n) {
        int sum = n*(n + 1) / 2;
        System.out.println("The sum of the first " + N + " numbers is: " + sum);
    }    
}
