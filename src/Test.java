public class Test {

    public static void main(String[] args) {
        System.out.println(1|1);
        System.out.println(0&1);
    }

    public int reverseBits(int n) {
        int out = 0;
        for (int i = 0; i < 32; i++) {
            out = out << 1;
            int t = n & 1;
            out += t;
            n = n >> 1;
        }
        return out;
    }
}
