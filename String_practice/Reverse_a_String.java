package String_practice;
import java.util.Scanner;
public class Reverse_a_String {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        int n =s1.length();
        String s2="";
        for(int i=n-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        System.out.println("Reversed String: "+s2);
        s.close();
    }
}
