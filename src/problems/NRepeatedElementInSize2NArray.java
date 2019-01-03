package problems;

import java.util.ArrayList;
import java.util.List;

public class NRepeatedElementInSize2NArray {

    public static void main(String[] args) {

        int[] ints = {2, 1, 2, 5, 3, 2};

        int res = new NRepeatedElementInSize2NArray().repeatedNTimes(ints);
        System.out.println(res);
    }

    public int repeatedNTimes(int[] A) {
        List<Integer> list = new ArrayList<>();

        // 只要判斷內容是否有重覆
        for (int i : A) {
            if (list.contains(i)) return i;
            list.add(i);
        }
        return -1;
    }
}
