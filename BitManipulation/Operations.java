package BitManipulation;

public class Operations {
    public static void main(String[] args) {
        System.out.println(getIthBit(5,2));
        System.out.println(setIthBit(5,2));
        System.out.println(clearIthBit(5,2));
        System.out.println(updateIthBit(5,2,1));
        System.out.println(clearIBits(14,2));
        System.out.println(clearIBits(10,2,4));
    }
    public static int getIthBit(int n, int i ) {
        int bitMask = 1 << i;
        return n & bitMask;
    }
    public static int setIthBit(int n, int i ) {
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static int clearIthBit(int n, int i ) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
    public static int updateIthBit(int n, int i, int newBit ) {
        /**if(newBit == 0) {
            return clearIthBit(n,i);
        } else {
            return setIthBit(n,i);
        }**/
        n = clearIthBit(n,i);
        int BitMask = newBit << i;
        return n | BitMask;
    }

    public static int clearIBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }
    public static int clearIBits(int n, int i, int j) {
        int a = (~0) << (j+1);
        int b = (1<<i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }



}
