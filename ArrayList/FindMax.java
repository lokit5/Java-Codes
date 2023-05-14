package ArrayList;

import java.util.ArrayList;
public class FindMax {
    //O(n)=
    public static int max(ArrayList list) {
        int max = (int)list.get(0);
        for(int i =  1; i < list.size(); i++) {
            if(max < (int)list.get(i)) {
                max = (int)list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list .add(10);
        list .add(2);
        list .add(3);
        list .add(4);
        list .add(5);
        System.out.println(max(list));
    }
}
