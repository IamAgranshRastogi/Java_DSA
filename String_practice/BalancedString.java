package String_practice;
import java.util.Scanner;
import java.util.Stack;

// {[()]}()[{{{}}}]  is a balanced string as each bracket is closed in the same order as it is opened
public class BalancedString{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a string consisting of brackets: ");
        String s1=s.nextLine();
        ParenthesisChecker(s1);
        s.close();
    }
    private static void ParenthesisChecker(String s1){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if(st.empty()){
                st.push(c);
            }
            else if(c=='{' || c=='(' || c =='['){
                st.push(c);
            }
            else if(c=='}' && st.peek()=='{'){
                st.pop();
            }
            else if(c==']' && st.peek()=='['){
                st.pop();
            }
            else if(c==')' && st.peek()=='('){
                st.pop();
            }
        }
        if(st.empty()){
            System.out.println("String is well formed");
        }
        else{
            System.out.println("String is not well formed");
        }
    }
}
