package problems;

public class FindTheDifference {

    public static void main(String[] args) {
        String s = "abcd", t = "aebcd";
        char res = new FindTheDifference().findTheDifference(s, t);
        System.out.println(res);
    }

    public char findTheDifference(String s, String t) {
        int res = 0;
        for (int c : t.toCharArray()) res += c;
        for (int c : s.toCharArray()) res -= c;
        return (char) res;
    }
}
