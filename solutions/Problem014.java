/**
 * Created by Max Muth on 10.08.14.
 * kontakt@maxi-muth.de
 * <p/>
 * Collatz Sequence
 * <p/>
 * <p/>
 * The following iterative sequence is defined for the set of positive integers:
 * n &rarr; n/2 (n is even)
 * n &rarr; 3n + 1 (n is odd)
 * <p/>
 * Which starting number, under one million, produces the longest chain?
 * <p/>
 * Solution: 837799
 */
public class Problem014 {

    private static final int RANGE = 1000000;

    public static void main(String[] args) {

        long resultNumber = 0;
        long biggestChain = 1;

        long tmpNumOfTerms = 1;

        for (long i = 1; i < RANGE; i++) {

            long a = i;
            while (nextCollatz(a) != 1) {
                a = nextCollatz(a);
                tmpNumOfTerms++;
            }

            if (tmpNumOfTerms > biggestChain) {
                biggestChain = tmpNumOfTerms;
                resultNumber = i;
            }
            tmpNumOfTerms = 1;
        }

        System.out.println("The longest Sequence has " + resultNumber + " with #terms = " + biggestChain);
    }

    private static long nextCollatz(long n) {
        if (n % 2 == 0)
            return n / 2;
        else
            return 3 * n + 1;
    }
}
