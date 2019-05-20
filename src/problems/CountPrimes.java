package problems;

public class CountPrimes {

    public static void main(String[] args) {
        int n = 5;
        int res = new CountPrimes().countPrimes(n);
        System.out.println(res);
    }

    public int countPrimes(int n) {
        int count = 0;
        boolean[] notPrime = new boolean[n];
        for (int i = 2; i < n; i++)
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i * j < n; j++) notPrime[i * j] = true;
            }
        return count;
    }
}
