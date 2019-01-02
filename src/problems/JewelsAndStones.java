package problems;

public class JewelsAndStones {

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";

        int res = new JewelsAndStones().numJewelsInStones(J, S);
        System.out.println(res);
    }

    public int numJewelsInStones(String J, String S) {

        int count = 0;
        for (char c : S.toCharArray()) {
            if (J.contains(String.valueOf(c))) count++;
        }
        return count;
    }
}
