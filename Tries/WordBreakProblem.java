package Tries;
import Tries.*;
public class WordBreakProblem {
    public static boolean wordBreak(String key) {
        if(key.length() == 0) {
            return true;
        }
        for(int i = 1; i <= key.length(); i++) {
            if(Implementation.search(key.substring(0,i)) &&
                    wordBreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
        for(int i = 0; i < arr.length; i++) {
             Implementation.insert(arr[i]);
        }
        String  key = "ilikesamsung";
        System.out.println(wordBreak(key));
    }
}
