package ArrayList;

import java.util.ArrayList;

public class PairSum2 {
    //brute force
    public static boolean pairSum2(ArrayList<Integer> list, int target) {

        for(int i = 0; i < list.size(); i++) {
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean pairSum2optimised(ArrayList<Integer> list, int target) {
        int bp = -1;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1;
        int rp = bp;

        while(lp != rp) {
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) > target) {
                rp = (list.size() + rp -1) % list.size();
            } else {
                lp = (lp + 1) % list.size();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //1,2,3,4,5,6
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(pairSum2optimised(list,target));
    }
}
