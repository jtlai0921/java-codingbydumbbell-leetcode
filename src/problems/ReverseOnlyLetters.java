package problems;

public class ReverseOnlyLetters {

    public static void main(String[] args) {
        String S = "Test1ng-Leet=code-Q!";
        String res = new ReverseOnlyLetters().reverseOnlyLetters(S);
        System.out.println(res);
    }

    public String reverseOnlyLetters(String S) {
        if (S.length() < 2) return S;

        char[] chars = S.toCharArray();
        StringBuilder sb = new StringBuilder(S.length());
        for (char c : chars) {
            if (Character.isLetter(c)) {
                sb.append(c);
            }
        }
        sb.reverse();
        for (int i = 0, j = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                chars[i] = sb.charAt(j++);
            }
        }
        return new String(chars);
    }
}
