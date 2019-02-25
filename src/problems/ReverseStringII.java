package problems;

public class ReverseStringII {

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 3;
        String res = new ReverseStringII().reverseStr(s, k);
        System.out.println(res);
    }

    public String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i += k) {
//            StringBuilder temp = (s.length() - i > k) ?
//                    new StringBuilder(s.substring(i, i + k)) : new StringBuilder(s.substring(i));
            StringBuilder temp = new StringBuilder(s.substring(i, (s.length() - i > k) ? i + k : s.length()));

            res.append(((i / k) % 2 == 0) ? temp.reverse() : temp);
        }
        return res.toString();
    }
}
