package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class JobSequencing {
    public static void main(String[] args) {
        int jobsInfo[][] = {{0,4,20},{1,2,10}, {2,1,40},{3,1,30}};

        Arrays.sort(jobsInfo, Comparator.comparingDouble(o -> o[2]));

        int time = 0;
        ArrayList<Character> ans = new ArrayList<>();
        for(int i = jobsInfo.length -1; i >= 0; i-- ) {
            if(jobsInfo[i][1] > time) {
                time ++;
                ans.add((char)(65 + jobsInfo[i][0]));
            }
        }
        System.out.println(ans);
    }
}
