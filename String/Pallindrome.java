package String;

public class Pallindrome {
    // racecar , noon , madam
    public static boolean isPallin(String str)
    {  int n=str.length();
       for(int i=0;i<str.length()/2;i++){ 
        if(str.charAt(i)!=str.charAt(n-1-i)){
        //not a pallindrome
        return false; 
        }
       }
       return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        String str2="racer";
        System.out.println(isPallin(str));
        System.out.println(isPallin(str2));
    }
}
