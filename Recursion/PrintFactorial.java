package Recursion;

public class PrintFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int n) {
        int fact;
        if(n == 0) {
            return 1;
        }
        fact = n * factorial(n-1);
        return fact;
    }
}
