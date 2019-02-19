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

        for (int i = 0; i < nums.length; i++) {

            // map 內容為「值」：「順序」
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {

            // 所需的數值 = 目標數值 - 目前的項目數值
            int complement = target - nums[i];

            // 搜尋 map 的 key(值)
            if (map.containsKey(complement) &&
                    map.get(complement) != i) // 陣列中的每個元素不能被重覆使用

                // 如果滿足上述兩個條件，則 return 該解
                return new int[]{i, map.get(complement)};
        }

        // 代表沒有這樣的解
        return null;
    }
}
