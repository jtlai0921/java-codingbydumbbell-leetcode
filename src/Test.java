public class Test {

    public static void main(String[] args) {
        long value = 2147483648L;
        int sign = -1;
        System.out.println("test1:");
        System.out.println(test1(value, sign));
        System.out.println("test2:");
        System.out.println(test2(value, sign));
    }

    private static int test1(long value, int sign) {
        if (value > Integer.MAX_VALUE) {
            System.out.println("path: A");
            return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        System.out.println("path: B");
        return (int) (sign * value);
    }

    private static int test2(long value, int sign) {
        if (sign > 0 && value > Integer.MAX_VALUE) {
            System.out.println("path: A");
            return Integer.MAX_VALUE;
        } else if (sign < 0 && -value < Integer.MIN_VALUE) {
            System.out.println("path: B");
            return Integer.MIN_VALUE;
        }
        System.out.println("path: C");
        return (int) (sign * value);
    }
}
/*
public String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0) return "";
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++)
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
        return pre;
    }
 */