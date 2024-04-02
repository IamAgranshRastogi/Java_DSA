import java.util.Scanner;
// Sum till N without using Loop
public class Sum_till_N {
    public static long sumFirstN(long n) { 
        return sumtillN(n);
    }
    public static long sumtillN(long n){
        if(n==0) return 0;
        return n + sumtillN(n-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = s.nextLong();
        System.out.print(sumFirstN(n));
        s.close();
    }
}
