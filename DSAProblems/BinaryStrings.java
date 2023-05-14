package DSAProblems;

public class BinaryStrings {
    public static void main(String[] args) {
        binaryStrings(3,0,"");
    }
    public static void binaryStrings(int n,int lastPlace, String str) {
        //base case
        if(n == 0) {
            System.out.println(str);
            return;
        }
        //kaam
        /**if(lastPlace == 0) {
            //sit 0 on chair n
            binaryStrings(n-1,0,str.append("0"));
            binaryStrings(n-1,1, str.append("1"));
        }
        else {
            binaryStrings(n-1,0, str.append("0"));
        }**/
        binaryStrings(n-1,0,str + "0");
        if(lastPlace == 0) {
            binaryStrings(n-1,1, str + "1");
        }
    }
}
