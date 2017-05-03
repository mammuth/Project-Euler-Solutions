import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max Muth on 21.08.14.
 * kontakt@maxi-muth.de
 * <p/>
 * The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from left to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.
 * <p/>
 * Find the sum of the only eleven primes that are both truncatable from left to right and right to left.
 */
public class Problem037 extends EulerLibrary {


    public static void main(String[] args) {

        List<Integer> truncatables = new ArrayList<Integer>();
        int number = 8;

        int tmp, tmp2;
        boolean isTruncatable;

        // There are only 11 of them
        while (truncatables.size() < 11) {

            tmp = number;
            tmp2 = number;
            isTruncatable = true;

            if (isPrime(number)) {
                for (int i = 0; i < String.valueOf(number).length(); i++) {

                    tmp /= 10;
                    tmp2 %= Math.pow(10, String.valueOf(number).length() - i - 1);
                    if ((tmp > 0 && tmp2 > 0) && (!isPrime(tmp)
                            || !isPrime(tmp2))) {
                        isTruncatable = false;
                        break;
                    }

                }

                if (isTruncatable) {
                    truncatables.add(number);
                }

            } // end of if

            number++;

        }

        int sum = 0;
        for (int i : truncatables)
            sum += i;
        System.out.println(sum);

    }

}
