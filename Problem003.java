import java.util.ArrayList;
import java.util.List;

/**
 * Created by mammuth on 04.08.14.
 * <p/>
 * Solution: 6857
 */
public class Problem003 {
    /**
     * The prime factors of 13195 are 5, 7, 13 and 29.
     * What is the largest prime factor of the number 600851475143 ?
     * Result: 6857
     */
    private static Double number = 600851475143.0;

    public static void main(String[] args) {
        List<Double> factors = getPrimeFactors(number);
        // System.out.printf("The largest prime factor of %d is %d", number, factors.get(factors.size() - 1));
        System.out.println("The largest prime factor of " + number + " is " + factors.get(factors.size() - 1));
    }

    private static List<Double> getPrimeFactors(Double number) {
        Double n = number;
        List<Double> factors = new ArrayList<Double>();
        for (Double i = 2.0; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }
}
