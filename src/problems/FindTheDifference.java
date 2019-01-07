package problems;

public class FindTheDifference {

    public static void main(String[] args) {
        String s = "abcd";
        String t = "aebcd";

        char res = new FindTheDifference().findTheDifference(s, t);
        System.out.println(res);
    }

    public char findTheDifference(String s, String t) {

        int i = 0;
        // 算出 t 字串的總和
        for (int c : t.toCharArray()) {
            i += c;
        }
        // 扣掉 s 字串的總和
        for (int c : s.toCharArray()) {
            i -= c;
        }
        return (char) i;
    }
}
