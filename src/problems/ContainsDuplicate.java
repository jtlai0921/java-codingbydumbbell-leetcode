package problems;

import java.util.Arrays;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 3, 3, 4};
        boolean res = new ContainsDuplicate().containsDuplicate(nums);
        System.out.println(res);
    }
    
    public boolean containsDuplicate(int[] nums) {
        // 排列
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ) if (nums[i] == nums[++i]) return true;
        return false;
    }
}
