package problems;

public class PalindromeNumber {

    public static void main(String[] args) {

        int i = 121;

        boolean res = new PalindromeNumber().isPalindrome(i);
        System.out.println(res);
    }

    public boolean isPalindrome(int x) {

        // 如果 x < 0 就 return false
        if (x < 0) return false;

        String str = String.valueOf(x);

        while (true) {

            // 若長度小於 2, 則代表可能為空字串或單字
            if (str.length() < 2) return true;

            // 判斷字串的第一個是否等於最後一個, 沒有則 return false
            if (str.charAt(0) != str.charAt(str.length() - 1)) return false;

            str = str.substring(1, str.length() - 1);
        }
    }
}
