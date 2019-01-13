package problems;


public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        new RotateArray().rotate(nums, k);

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public void rotate(int[] nums, int k) {

        for(int x = 0; x <= nums.length-1; x++){

            nums[(x+k) % nums.length ] = nums[x];
        }
    }
}
