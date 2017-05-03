/**
 * Created by Max Muth on 05.08.14.
 * kontakt@maxi-muth.de
 * <p/>
 * <p/>
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385 *
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 552 = 3025 *
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * <p/>
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * <p/>
 * Solution:
 * Sum of the squares = 338350
 * Square of the sum = 25502500
 * Difference = 25164150
 */

public class Problem006 {
    public static void main(String[] args) {
        int[] sums = calculateSums(100);
        System.out.println("Sum of the squares = " + sums[0] + "\nSquare of the sum = " + sums[1] + "\nDifference = " + sums[2]);
    }

    private static int[] calculateSums(int range) {
        int[] result = new int[3];
        for (int i = 1; i <= range; i++) {
            result[0] += i;
            result[1] += i * i;
        }
        result[2] = result[0] * result[0] - result[1];
        return result;
    }


}
