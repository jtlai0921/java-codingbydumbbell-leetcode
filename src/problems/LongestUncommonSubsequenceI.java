package problems;

public class LongestUncommonSubsequenceI {

    public static void main(String[] args) {
        String a = "", b = "";
        int res = new LongestUncommonSubsequenceI().findLUSlength(a, b);
        System.out.println(res);
    }

    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
