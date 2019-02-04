package problems;

public class PowerOfThree {

    public static void main(String[] args) {
        int n = 27;
        boolean res = new PowerOfThree().isPowerOfThree(n);
        System.out.println(res);
    }

    public boolean isPowerOfThree(int n) {
        return (n > 0 && Math.pow(3, 19) % n == 0);
    }
}
