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
        for (int c : t.toCharArray()) {
            i += c;
        }
        for (int c : s.toCharArray()) {
            i -= c;
        }
        return (char) i;
    }
}
