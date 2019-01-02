package problems;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] res = new TwoSum().twoSum(nums, target);

        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // map 內容為 num[i], i
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {

            // 所需的數值 = 目標數值 - 目前的項目數值
            int complement = target - nums[i];

            // 搜尋 map 的 key 有沒有自己所需的值 && 該項不可以是自己
            if (map.containsKey(complement) && map.get(complement) != i)
                return new int[]{i, map.get(complement)};
        }

        // 代表沒有這樣的解
        return null;
    }
}
