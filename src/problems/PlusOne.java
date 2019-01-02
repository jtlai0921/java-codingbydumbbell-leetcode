package problems;

public class PlusOne {

    public static void main(String[] args) {
        int[] ints = {9, 9, 9};

        int[] res = new PlusOne().plusOne(ints);
        for (int i : res) {
            System.out.print(i + " ");
        }

    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
