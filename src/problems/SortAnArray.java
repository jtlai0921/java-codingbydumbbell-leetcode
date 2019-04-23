package problems;

import java.util.Arrays;

public class SortAnArray {

    public static void main(String[] args) {
        int[] nums = {5, 1, 1, 2, 0, 0};
        int[] res = new SortAnArray().sortArray(nums);
        for (int i : res) System.out.print(i + " ");
    }

    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }
}

