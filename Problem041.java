/**
 * Created by Max Muth on 24.08.14.
 * kontakt@maxi-muth.de
 * <p/>
 * Largest Pandigital Prime
 * <p/>
 * Idea:
 * 1+2+3+4+5+6+7+8+9 = 45 → divisible by 3 → all 9 digit numbers are out of the game
 * same for 8 digits
 */
public class Problem041 extends EulerLibrary {

    public static void main(String[] args) {

        int max = 0;
        for (int p = 3; p < 7654321; p += 2)
            if (isPandigital(p) && isPrime(p) && p > max)
                max = p;

        System.out.println(max);

    }

}
