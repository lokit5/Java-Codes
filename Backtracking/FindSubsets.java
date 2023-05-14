package Backtracking;

public class FindSubsets {
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str,"",0);
    }
    public static void findSubsets(String str, String ans,int i) {
        //base case
        if(i == str.length()) {
            if(ans.length() == 0) {
                System.out.println("null");
            }
            System.out.print(ans + " ");
            return;
        }
        //recursion
        //Yes choice
        findSubsets(str,ans + str.charAt(i), i+1);
        //no choice
        findSubsets(str,ans, i+1);
    }
}
