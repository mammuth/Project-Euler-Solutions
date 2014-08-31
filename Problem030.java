/**
 * Created by Max Muth on 19.08.14.
 * kontakt@maxi-muth.de
 * <p/>
 * Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 * eg. 1634 = 1^4 + 6^4 + 3^4 + 4^4 (fourth powers)
 */

public class Problem030 {

    private static final char VALUE_OF_ZERO = 48;

    public static void main(String[] args) {

        long sum = 0;

        for (int i = 2; i < 1000000; i++) {

            int currentSum = 0;

            for (char c : String.valueOf(i).toCharArray()) {

                currentSum += Math.pow(c - VALUE_OF_ZERO, 5);

            }

            if (currentSum == i) sum += i;

        }

        System.out.println(sum);

    }

}
