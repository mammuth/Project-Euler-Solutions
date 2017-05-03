/**
 * Created by Max Muth on 21.08.14.
 * kontakt@maxi-muth.de
 * <p/>
 * Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2. (palindromic in decimal AND binary)
 */
public class Problem036 extends EulerLibrary {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i < 1000000; i++) {
            if (isPalindrome(String.valueOf(i))
                    && isPalindrome(String.valueOf(Integer.toBinaryString(i))))
                sum += i;
        }

        System.out.println(sum);

    }

}
