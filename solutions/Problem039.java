/**
 * Created by Max Muth on 23.08.14.
 * kontakt@maxi-muth.de
 */

public class Problem039 extends EulerLibrary {

    public static void main(String[] args) {

        System.out.println("BruteForce:");
        startTimeMeasurement();
        bruteForce();
        stopTimeMeasurement();
        System.out.println("Optimized:");
        startTimeMeasurement();
        arithmetic();
        stopTimeMeasurement();

    }

    private static int arithmetic() {

        int maxSolutions = 0, maxP = 0;
        for (int p = 1; p <= 1000; p+=2) {

            int tmpNumOfSolutions = 0;
            for (int a = 1; a < (p/3); a++) {

                int b = (p * p - 2 * p * a) / (2 * p - 2 * a);
                if (a + b + Math.sqrt(a * a + b * b) == p)
                    tmpNumOfSolutions++;

            }

            if (tmpNumOfSolutions > maxSolutions) {
                maxSolutions = tmpNumOfSolutions;
                maxP = p;
            }
        }

        return maxP;
    }

    private static int bruteForce() {

        int maxSolutions = 0, maxP = 0;
        for (int p = 1; p <= 1000; p++) {

            int tmpNumOfSolutions = 0;
            for (int a = 1; a < p; a++) {
                for (int b = 1; b < p; b++) {

                    if (a + b + Math.sqrt(a * a + b * b) == p)
                        tmpNumOfSolutions++;

                }

            }

            if (tmpNumOfSolutions > maxSolutions) {
                maxSolutions = tmpNumOfSolutions;
                maxP = p;
            }

        }

        return maxP;
    }
}
