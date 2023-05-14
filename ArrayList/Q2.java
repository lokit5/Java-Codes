package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Q2 {
    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        if(!((nums.get(1) == nums.get(0) + 1)||nums.get(1) == nums.get(0))) {
            list.add(nums.get(0));
        }
        for(int i = 1; i < nums.size() - 1; i++) {
            if(!((nums.get(i) == nums.get(i - 1))||(nums.get(i) == nums.get(i + 1)) || (nums.get(i) - 1  == nums.get(i - 1)) || nums.get(i) + 1 == nums.get(i + 1))) {
                list.add(nums.get(i));
            }
        }
        if (!((nums.get(nums.size() - 1) -1 == nums.get(nums.size() - 2) )||(nums.get(nums.size() - 1) == nums.get(nums.size() - 2)))) {
            list.add(nums.get(nums.size()-1));
        }
        System.out.println(nums);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        System.out.println(findLonely(nums));
    }
}
