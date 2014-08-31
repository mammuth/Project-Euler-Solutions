import java.math.BigInteger;

/**
 * Created by Max Muth on 13.08.14.
 * kontakt@maxi-muth.de
 * <p/>
 * What is the sum of the digits of the number 2^1000?
 * <p/>
 * Solution: 1366
 */

public class Problem016 {

    public static void main(String[] args) {

        BigInteger b = (new BigInteger("2")).pow(1000);

        String s = String.valueOf(b);
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            sum += s.charAt(i) - '0';

        }

        System.out.println(sum);

    }

}
