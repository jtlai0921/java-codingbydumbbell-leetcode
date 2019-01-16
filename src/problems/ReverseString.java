package problems;

public class ReverseString {

    public static void main(String[] args) {
        String string = "A man, a plan, a canal: Panama";

        String res = new ReverseString().reverseString(string);
        System.out.println(res);
    }

    public String reverseString(String s) {
        // 排除 s == null 和 s 長度小於等於 1 的情況
        if (s == null || s.length() <= 1) return s;

        // 將字串轉成 char 陣列
        char[] chars = s.toCharArray();

        // 用 StringBuilder 的效率會好過 s
        StringBuilder sb = new StringBuilder(s.length());

        // 將字串逐一反轉拼起
        for (int i = s.length(); i > 0; i--) {
            sb.append(chars[i - 1]);
        }
        return sb.toString();
    }
}
