package problems;

public class DIStringMatch {
    public static void main(String[] args) {
        String s = "DDI";

        int[] res = new DIStringMatch().diStringMatch(s);
        for (int i : res) {
            System.out.print(i+" ");
        }
    }

    public int[] diStringMatch(String S) {

        int len = S.length();
        int[] res = new int[len + 1];
        int s = 0, e = len ;
        for (int i = 0; i < len; i++) {

            if (S.charAt(i) == 'I') res[i] = s++;
            else res[i] = e--;
        }
        res[len] = s;

        return res;
    }
}
