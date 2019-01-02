package problems;

public class ReverseInteger {

    public static void main(String[] args) {
        int i = 123;

        int res = new ReverseInteger().reverse(i);
        System.out.println(res);
    }

    public int reverse(int x) {
        // 解決 int 超出範圍的問題
        long res = 0;
        while (x != 0) {
            res = res * 10 + (x % 10);
            x /= 10;
            // 判斷該數值是否超出範圍
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        }
        return (int) res;
    }
}
