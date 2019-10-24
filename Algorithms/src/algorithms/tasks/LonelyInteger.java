package algorithms.tasks;

import java.util.*;

//https://www.hackerrank.com/challenges/lonely-integer/problem
public class LonelyInteger {

    public static void main(String[] args) {
        lonelyInteger(new int[]{0, 0, 1, 2, 1});
    }

    static int lonelyInteger(int[] a) {
        List<Integer> res = new ArrayList<>();
        for(int x : a) {
            if(res.contains(x)) {
                res.remove(res.indexOf(x));

            } else {
                res.add(x);
            }
        }

        return res.get(0);
    }
}
