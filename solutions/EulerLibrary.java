import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max Muth on 21.08.14.
 * kontakt@maxi-muth.de
 * <p/>
 * Some stuff I though I might could need another time.
 */
public class EulerLibrary {

    public static final char VALUE_OF_ZERO = 48; // Usage: [int] = [char] - VALUE_OF_ZERO
    private static long startTime;
    private static List<String> tmpList = new ArrayList<String>();

    /**
     * @param n
     * @return is 'n' prime or not?
     */
    public static boolean isPrime(long n) {
        if (n <= 1)
            return false;

        if (n == 2)
            return true;

        if (n % 2 == 0)// check divisibility by 2
            return false;

        double sqrt = Math.sqrt(n);
        for (long i = 3; i <= sqrt; i += 2)
            if (n % i == 0)
                return false;

        return true;
    }

    /**
     * Fast for 0 - 9.999.999 (1-2s)
     * 0 - 99.999.999 takes around 1,5m
     *
     * @param start
     * @param end
     * @return List of primes between 'start' and 'end'
     */
    public static List<Integer> primesInRange(int start, int end) {

        List<Integer> primes = new ArrayList<Integer>();
        if (start < 1) {
            start = 3;
            primes.add(2);
        }

        // Gerade Starts kicken.
        if (start % 2 == 0)
            start += 1;

        for (long n = start; n < end; n += 2) {

            boolean isPrime = true;
            for (long i : primes) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
                if (i * i > n)
                    break;

            }

            if (isPrime)
                primes.add((int) n);
        }

        return primes;
    }


    /**
     * @param number
     * @return list containing all prime factors of 'number'
     */
    public static List<Double> getPrimeFactors(Double number) {
        Double n = number;
        List<Double> factors = new ArrayList<Double>();
        for (Double i = 2.0; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }

    /**
     * @param position
     * @return number at 'position' in the fibonacci-sequence
     */
    public static long fibonacci(int position) {
        long f, g;
        for (f = 1, g = 1; f <= position; g += f, f = g - f) {
        }
        return f;
    }


    public static long binomial(int n, int k) {
        long result = 1;
        for (int i = 1; i < k + 1; i++) {
            result *= (n - (k - i));
            result /= i;
        }
        return result;
    }

    public static long factorial(int n) {
        long res = 1;
        for (int i = n; i > 0; i--)
            res *= i;
        return res;
    }

    /**
     * a pandigital number is an integer that in a given base has among its significant digits each digit used in the base at least once. For example, 1223334444555567890
     *
     * @param s
     * @return
     */
    public static boolean isPandigital(String s) {

        for (int i = 1; i <= s.length() && i <= 9; i++)
            if (!s.contains(String.valueOf(i)))
                return false;

        return true;
    }

    /**
     * a pandigital number is an integer that in a given base has among its significant digits each digit used in the base at least once. For example, 1223334444555567890
     *
     * @param s
     * @return
     */
    public static boolean isPandigital(String s, int start, int end) {

        for (int i = start; i <= s.length() && i <= end; i++)
            if (!s.contains(String.valueOf(i)))
                return false;

        return true;
    }

    /**
     * Array of all 'startDigit'-'endDigit' Pandigitals.
     * (normally start := 0 and end := 9)
     * Attention: Contains numbers with leading zeros!
     *
     * @param startDigit
     * @param endDigit
     * @return Array containing all possible pandigitals(start, end)
     */
    public static Long[] pandigitals(int startDigit, int endDigit) {
        String str = "";
        for (int i = startDigit; i <= endDigit; i++)
            str += String.valueOf(i);

        String[] p = permutations(str);
        List<Long> pan = new ArrayList<Long>();
        for (int i = 0; i < p.length; i++)
            if (p[i].charAt(0) != '0')
                pan.add(Long.valueOf(p[i]));
        return pan.toArray(new Long[pan.size()]);
    }

    /**
     * a pandigital number is an integer that in a given base has among its significant digits each digit used in the base at least once. For example, 1223334444555567890
     *
     * @param i
     * @return
     */
    public static boolean isPandigital(int i) {
        return isPandigital(String.valueOf(i));
    }

    /**
     * Integer Rotation
     *
     * @param n
     * @return array containing all rotations of n (n = 123 → [231,312,123] (including itself)
     */
    public static int[] rotations(int n) {
        String s = String.valueOf(n);
        int[] r = new int[s.length()];

        for (int i = 0; i < s.length(); i++)
            r[i] = Integer.valueOf(s.substring(i) + s.substring(0, i));

        return r;
    }

    /**
     * String Rotation
     *
     * @param s
     * @return array containing all rotations of n (n = 123 → [231,312,123] (including itself)
     */
    public static String[] rotations(String s) {
        String[] r = new String[s.length()];

        for (int i = 0; i < s.length(); i++)
            r[i] = s.substring(i) + s.substring(0, i);

        return r;
    }

    /**
     * Permutations of a String
     *
     * @param str
     * @return
     */
    public static String[] permutations(String str) {
        permutation("", str);
        String[] arr = new String[tmpList.size()];
        for (int i = 0; i < tmpList.size(); i++)
            arr[i] = tmpList.get(i);

        return arr;
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            tmpList.add(prefix);
        } else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }
    }

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++)
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;

        return true;
    }

    public static boolean isPalindrome(int i) {
        return isPalindrome(String.valueOf(i));
    }

    public static long sum(List<Integer> ints) {
        long sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return sum;
    }

    /**
     * @param s
     * @return reversed String abcde → edcba
     */

    public static String reverseString(String s) {
        char[] ca = new char[s.length()];

        for (int i = 0; i < s.length(); i++)
            ca[i] = s.charAt(s.length() - i - 1);

        return String.valueOf(ca);
    }

    /**
     * Reads a file and returns an String[] according to the 'splitCharacter'
     *
     * @param fileName
     * @param splitCharacter
     * @return
     * @throws IOException
     */
    private static String[] readFile(String fileName, String splitCharacter) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(fileName));
        return new String(encoded, StandardCharsets.UTF_8).split(splitCharacter);
    }

    /**
     * Reads a file and returns a list containing all lines
     *
     * @param fileName
     * @return
     * @throws IOException
     */
    private static List<String> readFileLineByLine(String fileName) throws IOException {
        List<String> lines = new ArrayList<String>();

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = br.readLine()) != null)
            lines.add(line);

        br.close();
        return lines;
    }

    public static void startTimeMeasurement() {
        startTime = System.currentTimeMillis();
    }

    /**
     * Prints 'after 3.294s'
     */
    public static void startLapseTimeMeasurement() {
        System.out.println("after " + (System.currentTimeMillis() - (double) startTime) / 1000 + "s");
    }

    public static void stopTimeMeasurement() {
        System.out.println("Actual Runtime: " + (System.currentTimeMillis() - (double) startTime) / 1000 + "s");
    }
}
