package problems;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "   a   b ";
        String res = new ReverseWordsInAString().reverseWords(s);
        System.out.println(res);
    }

    public String reverseWords(String s) {

//        String[] words = s.trim().split(" +");
//        Collections.reverse(Arrays.asList(words));
//        return String.join(" ", words);

//        StringBuilder sb = new StringBuilder();
//        for (String str : s.split(" +")) {
//            sb.insert(0, str).insert(0, " ");
//        }
//        return sb.toString().trim();

        String str = s.trim();
        StringBuilder result = new StringBuilder(str.length());
        int j = str.length();
        int i = str.length() - 1;
        while (i > 0) {
            if (str.charAt(i) == ' ') {
                result.append(str, i + 1, j);
                result.append(" ");
                i--;
                while (str.charAt(i) == ' ') {
                    i--;
                }
                j = i + 1;
            } else {
                i--;
            }
        }
        result.append(str, 0, j);
        return result.toString();
    }
}
