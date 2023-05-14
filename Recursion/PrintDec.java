package Recursion;

public class PrintDec {
    public static void main(String[] args) {
        printDec(10);
    }
    public static void printDec(int n) {
        if(n == 0) {
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
}
