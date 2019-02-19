package problems;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        int[] res = new PlusOne().plusOne(digits);
        for (int i : res) System.out.print(i + " ");
    }

    public int[] plusOne(int[] digits) {

        // 從個位數開始判斷起
        for (int i = digits.length - 1; i >= 0; i--) {

            // 如果當前位數不是 9，就直接 +1 回傳
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else // 如果當前位數是 9，就直接補成 0，然後繼續判斷下一位
                digits[i] = 0;
        }

        // 若程式碼執行到這行代表，該數字的所有位數皆為 9，就回傳下一位為 1，其他為 0 的陣列
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
