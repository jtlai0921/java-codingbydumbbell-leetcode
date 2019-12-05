package problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15}, target = 9;
        int[] res = new TwoSum().twoSum(nums, target);
        for (int i : res) System.out.print(i + " ");
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        // 『值』當作 key，『順序』當作 value
        for (int i = 0; i < nums.length; i++) map.put(nums[i], i);
        for (int i = 0; i < nums.length; i++) {

            // 所需數值 = 目標值 - 當前值
            int complement = target - nums[i];
            if (map.containsKey(complement) && // 判斷 Map 中是否有符合的值
                    map.get(complement) != i) // 判斷是否為同一個元素

                // 若符合上述兩個條件，則為答案
                return new int[]{i, map.get(complement)};
        }
        return null; // 代表沒有符合
    }
}
