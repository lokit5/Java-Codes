package DSAProblems;

public class ShortestPath {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(ShortestPath(path));
    }
    public static double ShortestPath(String path){
        int x = 0;
        int y = 0;
        for(int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if(dir =='N') {
                y++;
            } else if( dir=='S') {
                y--;
            } else if( dir =='W') {
                x--;
            } else {
                x++;
            }
        }
        return (Math.sqrt((x*x+y*y)));
    }
}
