/**
 * Created by Max Muth on 21.08.14.
 * kontakt@maxi-muth.de
 * <p/>
 * Find the sum of all numbers which are equal to the sum of the factorial of their digits.
 * (1! + 4! + 5! = 1 + 24 + 120 = 145.)
 */

public class Problem034 {

    private static final char VALUE_OF_ZERO = 48;

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 3, tmpSum = 0; i < 1000000; i++, tmpSum = 0) {

            for (char c : String.valueOf(i).toCharArray())
                tmpSum += factorial(c - VALUE_OF_ZERO);

            if (tmpSum == i)
                sum += i;

        }

        System.out.println(sum);

    }

    private static int factorial(int n) {
        return n == 0 ? 1 : n * factorial(n - 1);
    }
}
