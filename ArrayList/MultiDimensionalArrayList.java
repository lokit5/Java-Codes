package ArrayList;

import java.util.ArrayList;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1 ; i <= 5; i++ ) {
            list.add(i);
        }
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 1 ; i <= 5; i++ ) {
            list2.add(i * 2);
        }
        mainList.add(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        for(int i = 1 ; i <= 5; i++ ) {
            list3.add(i * 3);
        }
        mainList.add(list3);

        for(int i = 0; i < mainList.size(); i++) {
            //ArrayList<Integer> currList = mainList.get(i);
            System.out.println(mainList.get(i));
        }
    }
}
