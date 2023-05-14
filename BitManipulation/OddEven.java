package BitManipulation;

public class OddEven {
    public static void main(String[] args) {
        System.out.println(oddEven(6));
    }
    public static String oddEven(int n) {
        if((n&1) == 1) {
            return "odd";
        } else {
            return "even";
        }
    }
}
