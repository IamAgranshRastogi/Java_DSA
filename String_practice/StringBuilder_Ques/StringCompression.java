package String_practice.StringBuilder_Ques;

public class StringCompression {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("aaabbcccdd");
        System.out.println(compress(str));
    }

    public static StringBuilder compress(StringBuilder str){
        StringBuilder newstr=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
        //     newstr += str.charAt(i);
        //     if(count>1){
        //        newstr += count.toString(i);
        //     }
        }
        return newstr;
    }
}
