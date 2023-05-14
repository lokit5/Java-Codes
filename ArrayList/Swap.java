package ArrayList;

import java.util.ArrayList;

public class Swap {
    public static void swap(ArrayList list,int index1, int index2) {
        int temp = (int)list.get(index2);
        list.set(index2,list.get(index1));
        list.set(index1,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list .add(1);
        list .add(2);
        list .add(3);
        list .add(4);
        list .add(5);
        swap(list,2,3);
        System.out.println(list);
    }
}
