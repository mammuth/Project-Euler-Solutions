/**
 * Created by Max Muth on 07.08.14.
 * kontakt@maxi-muth.de
 * <p/>
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * <p/>
 * Find the sum of all the primes below two million.
 *
 * Solution: 142913828922
 *
 */
public class Problem010 {
    public static void main(String[] args) {
        int n = 1;
        long sum = 0;
        while (n < 2000000) {
            if (isPrime(n)) {
                sum += n;
            }
            n++;
        }
        System.out.println("Sum of primes <  2.000.000 = " + (sum - 1));
    }

    private static boolean isPrime(int n) {
        if (n <= 3)
            return true;

        if (n % 2 == 0)// check divisibility by 2
            return false;

        double sqrt = Math.sqrt(n);
        for (long i = 3; i <= sqrt; i += 2)
            if (n % i == 0)
                return false;

        return true;
    }
}
