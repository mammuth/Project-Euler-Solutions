import java.util.HashMap;

/**
 * Created by Max Muth on 18.08.14.
 * kontakt@maxi-muth.de
 * <p/>
 * Sum of all the amicable numbers under 10000.
 * Solution: 31626
 */
public class Problem021 {

    public static void main(String[] args) {

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int sum = 0;

        for (int i = 1; i < 10000; i++) {
            if (!hm.containsKey(i)) {
                int sumOfDivisors = sumOfDivisors(i);

                if (hm.containsKey(sumOfDivisors) && hm.get(sumOfDivisors) == i) {
                    sum += sumOfDivisors + i;
                }

                hm.put(i, sumOfDivisors);
            }
        }


        System.out.println(sum);

    }

    private static int sumOfDivisors(int n) {
        int result = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                result += i;
            }
        }

        return result;
    }
}
