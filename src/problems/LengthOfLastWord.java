package problems;

public class LengthOfLastWord {

    public static void main(String[] args) {

        String s = "aaa";
        int res = new LengthOfLastWord().lengthOfLastWord(s);
        System.out.println(res);
    }

    public int lengthOfLastWord(String s) {
        return s.trim().lastIndexOf(" ") != -1 ? s.trim().length() - s.trim().lastIndexOf(" ") - 1 : s.trim().length();
    }
}
