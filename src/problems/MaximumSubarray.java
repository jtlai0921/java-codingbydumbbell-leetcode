package problems;

public class MaximumSubarray {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int res = new MaximumSubarray().maxSubArray(nums);
        System.out.println(res);
    }

    public int maxSubArray(int[] nums) {
        int sum = 0, res = -1;
        for (int i : nums) {
            sum += i;
            if (sum > res) res = sum;
            else if (sum < 0) sum = 0;
        }
        return res;
    }
}
