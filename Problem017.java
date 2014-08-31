/**
 * Created by Max Muth on 13.08.14.
 * kontakt@maxi-muth.de
 * <p/>
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 * <p/>
 * Solution: 21124
 */
public class Problem017 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            System.out.println(translateToLetters(i));
            sum += translateToLetters(i).replaceAll(" ", "").length();
        }

        System.out.println("Result: " + sum);

    }

    // Where the magic happens
    private static String translateToLetters(int i) {

        String s = "";

        if (i == 1000) {
            return "one thousand";
        }
        // prevent 200 -> two hundred and
        if (i % 100 == 0) {
            return ONES[i / 100] + " hundred";
        }

        // Now lets run through the number:
        // 'Hundred-digit'
        if (i > 99 && i < 1000) {
            s += ONES[i / 100] + " hundred and ";
            i = i % 100;
        }
        // 'Tens'
        if (i > 19 && i < 100) {
            s += TENS[i / 10 - 2] + " ";
            i = i % 10;
        }
        // 'Ten-To-Ninteen'
        if (i > 9 && i < 20) {
            s += TEN_TO_NINTEEN[i - 10] + " ";
        }
        // 'Ones'
        if (i < 10) {
            s += ONES[i];
        }

        return s;

    }

    private static String[] ONES = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static String[] TEN_TO_NINTEEN = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static String[] TENS = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

}
