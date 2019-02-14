package problems;

public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int res = new MissingNumber().missingNumber(nums);
        System.out.println(res);
    }

    public int missingNumber(int[] nums) {

        // 利用梯形公式求出總和
        int len = nums.length, sum = (len + 1) * len / 2;
        // 減去陣列所有項總和
        for (int n : nums) sum -= n;
        return sum;
    }
}
