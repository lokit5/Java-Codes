package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coin[] = {1,2,5,10,20,50,100,500,2000};
        int amt = 590;

        Arrays.sort(coin, Comparator.reverseOrder());
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < coin.length; i++) {
            while(amt >= coin[i]) {
                count++;
                amt -= coin[i];
                ans.add(coin[i]);
            }
        }
        System.out.println(count);
        System.out.println(ans);
    }
}
