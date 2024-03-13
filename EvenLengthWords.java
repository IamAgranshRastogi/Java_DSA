import java.util.Scanner;

public class EvenLengthWords {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a paragraph to check for even no. of words: ");
        String s1=s.nextLine();
        System.out.println("The words of a string which are having even number of length: ");
        for(String str: s1.split(" ")){
            if(str.length()%2==0){
                System.out.println(str);
            }
        }
        s.close();
    }
}
