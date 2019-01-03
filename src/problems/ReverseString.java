package problems;

public class ReverseString {

    public static void main(String[] args) {
        String string = "A man, a plan, a canal: Panama";

        String res = new ReverseString().reverseString(string);
        System.out.println(res);
    }

    public String reverseString(String s) {
        char[] chars = s.toCharArray();

        StringBuilder sb = new StringBuilder(s.length());
        for (int i = s.length(); i > 0; i--) {
            sb.append(chars[i - 1]);
        }

        return sb.toString();
    }
}
