package Recursion;

public class Q2 {
    public static void main(String[] args) {
        printString(1947, new StringBuilder(""));
    }
    static String digits[] = {"zero ","one ","two ","three ","four ","five ","six ","seven ","eight ", "nine "};
    public static void printString(int n,StringBuilder str) {
        if(n == 0){
            System.out.println(str);
            return;
        }
        //kaam

        str.insert(0,digits[n % 10]);
        printString(n/10,str);
    }
}
