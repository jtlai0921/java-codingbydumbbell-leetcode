package problems;

public class HappyNumber {

    public static void main(String[] args) {
        int n = 19;
        boolean res = new HappyNumber().isHappy(n);
        System.out.println(res);
    }

    public boolean isHappy(int n) {
        if (n == 1) return true;//1 is included in happy number loop
        if (n == 4) return false;//4 is included in unhappy number loop

        int sum = 0;
        for (; n > 0; n /= 10)
            sum += (int) Math.pow(n % 10, 2);
        return isHappy(sum);
    }
}
