package String.StringBuilder;

public class ToString {
    public static void main(String[] args) {
       Integer x=10;
       System.out.println(x.toString());
       
       /* 
       int x2=10;
       System.out.println(x2.toString()); */
// Will provide error can't be used with primitive data types
// toString() only converts any Object to String Object. 

       StringBuilder sb=new StringBuilder("");
       for(char ch='a';ch<='z';ch++){
           sb.append(ch);
       } //abcdef....
       System.out.println(sb);
    } 
}
// TC: O(26)


// If we used String then TC: O(n^2)
