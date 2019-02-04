package problems;

public class StringWithoutAAAOrBBB {

    public static void main(String[] args) {
        int A = 1, B = 4;
        String res = new StringWithoutAAAOrBBB().strWithout3a3b(A, B);
        System.out.println(res);
    }

    public String strWithout3a3b(int A, int B) {
        return (A > B) ? combinChar(A, B, 'a') : combinChar(B, A, 'b');
    }
    private String combinChar(int A, int B, char C) {
        StringBuilder sb = new StringBuilder(A + B);
        while (A-- > 0) {
            sb.append(C);
            if (A > B) {
                sb.append(C);
                A--;
            }
            if (B-- > 0) sb.append((char) ('a' + 'b' - C));
        }
        return sb.toString();
    }
}
