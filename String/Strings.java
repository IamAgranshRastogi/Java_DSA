package String;
import java.util.*;
public class Strings {
    public static void printLetters(String str) {
        for(int i=0;i<str.length();i++)
        { System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
     char arr[]={'a','b','c','d'};
     System.out.println(arr);
    // String Declaration 
    // String str1="abcd";
    // String str2=new String("xyz");
    
    // Strings are immutable(unchangeable)
    Scanner s=new Scanner(System.in);
    
    String name1;
    name1=s.next(); // input single word/first space
    System.out.println(name1);
    
    String name2=s.nextLine(); //input multiple words/whole line
    System.out.println(name2);
    
    String fullname= name1+name2; //String Concatenation
    System.out.println(fullname); 
    System.out.print(fullname.length());  

    System.out.println(fullname.charAt(2)); 
    printLetters(fullname);


    s.close();
    }
}
