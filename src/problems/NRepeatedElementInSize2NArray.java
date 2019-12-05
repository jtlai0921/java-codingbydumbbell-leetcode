package problems;

import java.util.ArrayList;
import java.util.List;

public class NRepeatedElementInSize2NArray {

    public static void main(String[] args) {
        int[] A = {2, 1, 2, 5, 3, 2};
        int res = new NRepeatedElementInSize2NArray().repeatedNTimes(A);
        System.out.println(res);
    }

    public int repeatedNTimes(int[] A) {
        List<Integer> list = new ArrayList<>();
        for (int i : A) {
            // 判斷是否有重覆
            if (list.contains(i)) return i;
            list.add(i);
        }
        return -1;
    }
}
