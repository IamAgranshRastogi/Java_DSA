package String_practice;

public class Shortest_Path {
    public static float getShortestPath(String path){
        int x=0, y=0;
// TC: O(n)
        for(int i=0;i<path.length();i++){
            char dir= path.charAt(i);
            // South
            if(dir=='S'||dir=='s'){
                y--;
            }
            // North
            else if(dir=='N'||dir=='n'){
                y++;
            }
            // East
            else if(dir=='E'||dir=='e'){
                x++;
            }
            // West
            else {
                x--;
            }
        }
        int x2=x*x,y2=y*y; 
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path="wNeENeSEnnN";
        System.out.println(getShortestPath(path));
    }
    
}
