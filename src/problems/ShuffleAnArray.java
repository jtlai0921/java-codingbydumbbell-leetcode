package problems;

import java.util.Random;

public class ShuffleAnArray {

    public static void main(String[] args) {
        int[] nums = {4, 3, 5};
        Solution obj = new ShuffleAnArray().new Solution(nums);
        int[] param_1 = obj.reset();
        for (int i : param_1) System.out.println(i);
        int[] param_2 = obj.shuffle();
        for (int i : param_2) System.out.println(i);
    }

    class Solution {
        private int[] nums;

        public Solution(int[] nums) {
            this.nums = nums;
        }

        /**
         * Resets the array to its original configuration and return it.
         */
        public int[] reset() {
            return nums;
        }

        /**
         * Returns a random shuffling of the array.
         */
        public int[] shuffle() {
            int[] arr = nums.clone();
            for (int i = 0; i < nums.length; i++) {
                int temp = arr[i], r = new Random().nextInt(nums.length);
                arr[i] = arr[r];
                arr[r] = temp;
            }
            return arr;
        }
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
