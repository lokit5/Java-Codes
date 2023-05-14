package BitManipulation;

public class Q2 {
    public static void main(String[] args) {
        swap(10,5);
    }
    public static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);
    }
}
