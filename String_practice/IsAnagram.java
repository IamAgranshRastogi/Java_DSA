package String_practice;
import java.util.Scanner;

// the strings: 'aabb','abba' are anagram 
// Checking whether 2 strings are anagram or not
public class IsAnagram {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter string1: ");
        String s1=s.nextLine();
        System.out.print("Enter string2: ");
        String s2=s.nextLine();
        System.out.print("The strings are Anagram: "+TwoStringsAnagram(s1,s2));
        s.close();
    }
    public static boolean TwoStringsAnagram(String s1,String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        int count[]=new int[256]; // for count of each ASCII value of (256)
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}
