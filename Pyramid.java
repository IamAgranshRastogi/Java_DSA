import java.util.*;
class Pyramid{
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n =s.nextInt();
    int space=n-1;
    int star=1;
    int row=1;
    while(row<=n){

        int i=1;
        while(i<=space){
            System.out.print(" ");
            i+=1;
        }

        int j=1;
        while(j<=star){
            System.out.println("*"+"*");
            j+=1;
        }

        space -= 1;
        star += 2;
        row += 1;
        System.out.println();
    }
    System.out.println(1);
    s.close();
  }
}