import java.util.Collections;
import java.util.List;

/**
 * Created by Max Muth on 12. September 2014
 * kontakt@maxi-muth.de
 * <p/>
 * Consecutive prime sum
 */
public class Problem050 extends EulerLibrary {

    public static void main(String[] args) {

        List<Integer> primes = primesInRange(0, 1000000);
        int[] primeSum = new int[primes.size() + 1];

        for (int i = 0; i < primes.size(); i++) {
            primeSum[i + 1] = primeSum[i] + primes.get(i);
        }

        long result = 0;
        int numberOfPrimes = 0;

        for (int i = numberOfPrimes; i < primeSum.length; i++) {
            for (int j = i - (numberOfPrimes + 1); j >= 0; j--) {
                if (primeSum[i] - primeSum[j] > 1000000)
                    break;

                if (Collections.binarySearch(primes, primeSum[i] - primeSum[j]) >= 0) {
                    numberOfPrimes = i - j;
                    result = primeSum[i] - primeSum[j];
                }
            }
        }

        System.out.println(result);

    }
}
