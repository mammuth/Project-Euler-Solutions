import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max Muth on 05.08.14.
 * kontakt@maxi-muth.de
 */
public class Problem004 {
    /**
     * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
     * <p/>
     * Find the largest palindrome made from the product of two 3-digit numbers.
     *
     * Solution: 906609 = 993 * 913
     */

    public static void main(String[] args) {
        Triple factor = biggestFactor(factorsForPalindromes(999));
        System.out.println(factor.palindrome + " = " + factor.factor1 + " * " + factor.factor2);
    }

    private static List<Triple> factorsForPalindromes(int biggestFactor) {
        List<Triple> result = new ArrayList<Triple>();

        for (int k = biggestFactor; k > 99; k--) {
            for (int m = biggestFactor; m > 99; m--) {
                if (isPalindromic(k * m)) {
                    result.add(new Triple(k, m, k * m));
                }
            }
        }
        return result;
    }

    private static boolean isPalindromic(int n) {
        String s = String.valueOf(n);
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    private static Triple biggestFactor(List<Triple> l) {
        Triple biggest = l.get(0);
        for (Triple f : l) {
            if (f.palindrome > biggest.palindrome) {
                biggest = f;
            }
        }
        return biggest;
    }
}

class Triple {
    int factor1;
    int factor2;
    int palindrome;

    Triple(int factor1, int factor2, int product) {
        this.factor1 = factor1;
        this.factor2 = factor2;
        this.palindrome = product;
    }
}