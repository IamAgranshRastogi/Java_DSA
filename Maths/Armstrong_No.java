import java.util.Scanner;
// Armstrong No. : 153, 1634
// 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 
// 1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 =  1634

public class Armstrong_No {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to check if it is Armstrong or not: ");
        int n = s.nextInt();
        System.out.print("The Number is Armstrong: "+ ifArmstrong(n)); 
        s.close();
    }
    public static boolean ifArmstrong(int n){
        int original = n;
        int temp = n;
        int powcount = 0;
        while(temp != 0){
            powcount++;
            temp = temp/10;
        }
        int sum = 0;
        while(n != 0){
            int digit = n%10;
            sum += Math.pow(digit,powcount);
            n /= 10;
        }
        return (sum == original);
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)