package CP;
import static java.util.stream.Collectors.joining;

class Practice {

    public static int pageCount(int n, int p) {
        // Write your code here
        int t = p /2;
        int count = 0;
        if( n  < t) {
            for(int i = 1; i <= t; i= i +2) {

                if(i >= n) {
                    break;
                }
                count++;
            }
        } else {
            for(int i = p - 1; i >= t; i-=2) {

                if(i <= n) {
                    break;
                }
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(pageCount(3,7));
    }
}