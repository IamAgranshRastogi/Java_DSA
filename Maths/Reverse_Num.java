 import java.util.Scanner;
public class Reverse_Num{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to be reversed: ");
        int num = s.nextInt();
        int rem = 0;
        int rev = 0;

        while(num!=0){
            rem = num % 10;
            num = num / 10;
            rev = rev * 10 + rem;
        }

        System.out.print("Reverse of the number is : "+ rev);       
        s.close();
    }
}