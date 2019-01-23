package problems;

public class ReverseString {

    public static void main(String[] args) {
        String string = "A man, a plan, a canal: Panama";
        String res = new ReverseString().reverseString(string);
        System.out.println(res);

        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
        new ReverseString().reverseString(s);
        for (char c : s) {
            System.out.print(c + " ");
        }
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

    public void reverseString(char[] s) {
//        String str = new StringBuilder(String.valueOf(s)).reverse().toString();
//        for (int i = 0; i < s.length; i++) s[i] = str.charAt(i);

        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}
