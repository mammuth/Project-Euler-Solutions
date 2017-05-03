import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max Muth on 05.08.14.
 * kontakt@maxi-muth.de
 * <p/>
 * <p/>
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * <p/>
 * What is the 10.001st prime number?
 *
 * Solution: 104743
 *
 */
public class Problem007 {
    public static void main(String[] args) {
        int n = 1;
        List<Integer> primes = new ArrayList<Integer>();
        while (primes.size() <= 10001) {
            if (isPrime(n)) {
                primes.add(n);
            }
            n++;
        }
        System.out.println("The 10001st prime number is " + primes.get(primes.size() - 1));
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
