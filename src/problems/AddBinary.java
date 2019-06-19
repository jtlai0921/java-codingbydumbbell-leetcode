package problems;

public class AddBinary {

    public static void main(String[] args) {
        String a = "1010", b = "1011";
        String res = new AddBinary().addBinary(a, b);
        System.out.println(res);
    }

    public String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.valueOf(a, 2) + Integer.valueOf(b, 2));
    }
}
