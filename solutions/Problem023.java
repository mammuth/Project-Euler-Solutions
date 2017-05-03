import java.util.HashSet;

/**
 * Created by Max Muth on 18.08.14.
 * kontakt@maxi-muth.de
 * <p/>
 * Sum of ints that can not be written as sum of 2 abundant numbers ( = sum of divisors > number itself)
 * Solution: 4179871
 */
public class Problem023 {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        boolean[] abundantsLookUpTable = new boolean[28123 + 1];
        HashSet<Integer> sumsOfAllAbundants = new HashSet<Integer>();

        for (int i = 1; i <= 28123; i++) {

            // i abundant?
            if (sumOfDivisors(i) > i) {

                abundantsLookUpTable[i] = true;
                for (int a = 1; a < abundantsLookUpTable.length; a++) {
                    if (abundantsLookUpTable[a]) {
                        sumsOfAllAbundants.add(a + i);
                    }
                }

            }

        }

        int result = 0;
        for (int i = 1; i <= 28123; i++) {
            if (!sumsOfAllAbundants.contains(i)) {
                result += i;
            }
        }

        System.out.println(result);

    }

    private static int sumOfDivisors(int n) {
        int s = 0;
        for (int i = 1; 2 * i <= n; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        return s;
    }
}
