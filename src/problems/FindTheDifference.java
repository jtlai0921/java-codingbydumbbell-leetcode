package problems;


public class FindTheDifference {

    public static void main(String[] args) {
        String s = "abcd";
        String t = "aebcd";

        char res = new FindTheDifference().findTheDifference2(s, t);
        System.out.println(res);
    }

    public char findTheDifference2(String s, String t) {

        int i = 0;
        for (int c : t.toCharArray()) {
            i +=c;
        }
        System.out.println(i);
        for (int c : s.toCharArray()) {
            i -=c;
        }
        System.out.println(i);
        return (char) i;
    }
}
