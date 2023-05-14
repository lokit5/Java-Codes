package Heaps;

import java.util.PriorityQueue;

public class WeakestSoldier {
    static class Soldier implements Comparable<Soldier> {
        int row;
        int count;

        public Soldier(int row, int count) {
            this.row = row;
            this.count = count;
        }
        @Override
        public int compareTo(Soldier s2) {
            if (this.count == s2.count) {
                return this.row - s2.row;
            }
            return this.count - s2.count;
        }
    }
    public static void main(String[] args) {
        //given
        int arr[][] = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k = 2;
        int m = 4, n= 4;

        PriorityQueue<Soldier> pq = new PriorityQueue<>();

        for(int i = 0 ; i < m; i++) {
            int count = 0;
            for (int j = 0 ; j < n; j++) {
                if(arr[i][j] == 1) {
                    count++;
                }
            }
            pq.add(new Soldier(i,count));
        }
        for (int i = 0 ; i < k; i++) {
            System.out.println("row" + pq.remove().row);
        }
    }
}
