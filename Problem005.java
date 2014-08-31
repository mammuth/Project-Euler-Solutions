/**
 * Created by Max Muth on 05.08.14.
 * kontakt@maxi-muth.de
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 * Solution: 232792560
 */
public class Problem005 {
    public static void main(String[] args) {
        int n = 1;
        while (!invariant(n)) {
            n++;
        }
        System.out.println(n);
    }

    private static boolean invariant(int n) {
        for (int i = 1; i < 21; i++) {
            if (n % i != 0) {
                return false;
            }
        }
        return true;
    }
}
