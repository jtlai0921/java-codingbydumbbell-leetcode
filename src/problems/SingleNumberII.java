package problems;

public class SingleNumberII {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 1, 0, 1, 99};
        int res = new SingleNumberII().singleNumber(nums);
        System.out.println(res);
    }

    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if (((nums[j] >> i) & 1) == 1) {
                    sum++;
                    sum %= 3;
                }
            }
            if (sum != 0) {
                ans |= sum << i;
            }
        }
        return ans;
    }
}
