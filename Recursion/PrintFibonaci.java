package Recursion;

public class PrintFibonaci {
    public static void main(String[] args) {
        System.out.println(nthFibonaci(23));
        System.out.println(nthFibonaci(24));
        System.out.println(nthFibonaci(25));
        System.out.println(nthFibonaci(26));
        System.out.println(nthFibonaci(27));
        System.out.println(nthFibonaci(28));
    }
    public static int nthFibonaci(int n) {
        if(n == 0 ) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else
        return nthFibonaci(n -1) + nthFibonaci( n -2);
    }
}
