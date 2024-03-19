package String_practice;

import java.util.Scanner;
import java.util.Stack;
public class Rev_String_Words {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a String of more than 1 words: ");
        String st = s.nextLine();
        System.out.print("String after reversing order of words: ");
        // System.out.println(revWords1(st));
        // System.out.println(revWords2(st));
        System.out.println(revWords3(st));
        s.close(); 
    }
    

    // Brute Force Approach 
    // TC: O(n^2)   SC: O(n)
    public static String revWords1(String st){
        if (st == null || st.length() == 0)
        return "";

        StringBuilder sb = new StringBuilder();
        int pos = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == ' ') {
                pos = 0; // Reset position for next word
                continue;
            }
            if (pos == 0) {
                sb.insert(pos, ' '); // Insert space before word
                pos++;
            }
            sb.insert(pos, st.charAt(i)); // Insert character
            pos++;
        }
        return sb.toString().trim();
    }

    // Better Approach
    // TC: O(n)    SC: O(n)
    public static String revWords2(String st){
        if (st == null || st.length() == 0)
            return "";

        StringBuilder res = new StringBuilder();
        Stack<String> stack = new Stack<>();

        int start = 0;
        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            if (c == ' ') {
                if (i > start) {
                    String word = st.substring(start, i);
                    stack.push(word);
                }
                start = i + 1;
            } else if (i == st.length() - 1) {
                String word = st.substring(start);
                stack.push(word);
            }
        }

        while (!stack.isEmpty()) {
            res.append(stack.pop());
            if (!stack.isEmpty())
                res.append(" ");
        }

        return res.toString();
    }

    // Optimal Approach
    // TC: O(n)  SC: O(1)
    public static String revWords3(String st){
        if(st==null || st.length()==0){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        int pos=0;
        for(int i=0; i<st.length();i++){
            if(st.charAt(i)==' '){
                pos=0;
                continue;
            }
            if(pos==0){
                sb.insert(pos,' ');
                pos++;
            }
            sb.insert(pos,st.charAt(i));
            pos++;
        }
       return sb.toString().trim();
    }
}
