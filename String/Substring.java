package String;

public class Substring {
    public static void main(String[] args) {
        // Substr
        String str="HelloWorld";
        System.out.println(substring(str, 0, 5));
    }

    public static String substring(String str,int si, int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
}
