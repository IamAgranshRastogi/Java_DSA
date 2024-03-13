package String_practice;
import java.util.Scanner;
public class SumOfStrings{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        int sum = Integer.parseInt(s1)+Integer.parseInt(s2);
        System.out.println(sum);
        System.out.println(String.valueOf(sum));
        s.close();
    }
}