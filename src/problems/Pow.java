package problems;

public class Pow {

    public static void main(String[] args) {
        double d = new Pow().myPow(2, 10);
        System.out.println(d);
    }


    public double myPow(double x, int n) {
        // 解決 -n 可能會超出 int 上限值的問題, 所以重刻一個方法
        return clac(x, n);
    }

    private double clac(double x, long n) {

        // 任何數的零次方皆為 0
        if (n == 0) return 1;

        if (n > 0) {

            // 用遞迴的方法, 最後一定會 n = 0
            double res = clac(x, n / 2);

            // 每次扣除兩個次方
            res *= res;

            // 如果有餘, 代表還要再補一個次方, 因為 0.5 在下一輪 n/2 就會被忽略
            if (n % 2 != 0) res *= x;
            return res;
        } else // 負號轉換
            return clac(1 / x, -n);
    }
}


