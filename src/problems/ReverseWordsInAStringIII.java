package problems;

public class ReverseWordsInAStringIII {

    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";
        String res = new ReverseWordsInAStringIII().reverseWords(s);
        System.out.println(res);
    }

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (String str : s.split(" ")) {
            for (int i = str.length() - 1; i >= 0; ) sb.append(str.charAt(i--));
            sb.append(" ");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}
