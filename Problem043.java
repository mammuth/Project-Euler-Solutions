/**
 * Created by Max Muth on 29.08.14.
 * kontakt@maxi-muth.de
 * <p/>
 * Sub-string divisibility with pandigitals
 * <p/>
 * Theorems:
 * I d4d5d6 is divisible by 5 → d6 := 5 (0 violates pandigitality(^^))
 * <p/>
 * Actual Runtime ~5s
 */

public class Problem043 extends EulerLibrary {


    public static void main(String[] args) {

        startTimeMeasurement();

        Long[] pandigitals = pandigitals(0, 9);
        System.out.println("Done with generating pandigitals. Starting checking for invariant.");
        startLapseTimeMeasurement();

        long result = 0;

        for (long p : pandigitals) {

            if (String.valueOf(p).charAt(5) != '5')  // Theorem I
                continue;

            boolean panIsCool = true;
            for (int j = 1; j <= String.valueOf(p).length() - 3; j++)
                if (Integer.valueOf(String.valueOf(p).charAt(j) + "" + String.valueOf(p).charAt(j + 1) + "" + String.valueOf(p).charAt(j + 2)) % PRIMES[j - 1] != 0)
                    panIsCool = false;

            if (panIsCool)
                result += p;

        }

        System.out.println("Result: " + result);

        stopTimeMeasurement();
    }


    private static final int[] PRIMES = {2, 3, 5, 7, 11, 13, 17};

}
