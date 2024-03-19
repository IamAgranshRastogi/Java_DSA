import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        // System.out.print("Number of digits in "+n+" is "+count_digit1(n));
        // System.out.print("Number of digits in "+n+" is "+count_digit2(n));        
        System.out.print("Number of digits in "+n+" is "+count_digit3(n));
        s.close();
    }


    // Solution 1 : Counting divisions by 10
    // TC: O(n)  SC: O(1)
    public static int count_digit1(int n) {
        int num = n;
        int count = 0;
        while(num!=0){
            num = num/10;
            count++;
        }
        return count;
    }

    // Solution 2: Add 1 to Int part of Log(10) of Number
    // TC: O(1)  SC: O(1) 
    static int count_digit2(int n){
        int digits = (int) Math.floor(Math.log10(n) + 1);
        return digits;
    }

    // Solution 3 : Using String.length()
    // TC: O(1)  SC: O(1)
    public static int count_digit3(int n) {
        String num = Integer.toString(n);
        return num.length();
    }
    
}
