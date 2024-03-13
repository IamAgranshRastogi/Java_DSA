import java.util.Scanner;
public class WaveTraversal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter row no :");
        int n=s.nextInt();
        System.out.print("Enter column no. :");
        int m=s.nextInt();
        System.out.println("Enter Matrix Elements :");
        int mx[][]=new int[n][m];
        for(int i=0;i<mx.length;i++){
            for(int j=0;j<mx[0].length;j++){
                mx[i][j]=s.nextInt();
            }
        }
        System.out.println("Matrix :");
        for(int i=0;i<mx.length;i++){
            for(int j=0;j<mx[0].length;j++){
                System.out.print(mx[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Wave Traversal  :");
        WaveTraversing(mx);
        s.close();
    }
    public static void WaveTraversing(int mx[][]){
        for(int j=0;j<mx[0].length;j++){
          if(j%2==0){
            for(int i=0;i<mx.length;i++){
                System.out.print(mx[i][j]+" ");
            }
          }
          else{
            for(int i=mx.length-1;i>=0;i--){
               System.out.print(mx[i][j]+" ");
            }
          }
        }
    }    
}
