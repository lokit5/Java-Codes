package ArrayList;

import java.util.ArrayList;

public class Q1 {
    public static boolean isMonotonic(ArrayList<Integer> list) {
        if(list.get(0) < list.get(1) && list.get(1) > list.get(2)){
            return false;
        }
        if(list.get(0) > list.get(1)) {
            return isDecreasing(list);

        } else {
            return isIncreasing(list);
        }
    }
    public static boolean isIncreasing(ArrayList<Integer> list) {
        for(int i = 0; i < list.size() - 1; i++) {
            if(list.get(i) > list.get( i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreasing(ArrayList<Integer> list) {
        for(int i = 0; i < list.size() - 1; i++) {
            if(list.get(i) < list.get( i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isMonotonicOptimised(ArrayList<Integer> A) {
        boolean inc = true;
        boolean dec = true;
        for(int i = 0; i < A.size() - 1; i++) {
            if(A.get(i) > A.get(i+1)) {
                inc = false;
            }
            if(A.get(i) < A.get(i+1)) {
                dec = false;
            }
            if((inc && dec) == false) {
                return false;
            }
        }
        return inc || dec;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        System.out.println(list);
        System.out.println(isMonotonicOptimised(list));
    }
}
