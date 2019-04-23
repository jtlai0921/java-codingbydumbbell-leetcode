package problems;

import java.util.Arrays;

public class SortAnArray {

    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        int[] res = new SortAnArray().sortArray(nums);
        for (int i : res) System.out.print(i + " ");
    }

    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }
}
