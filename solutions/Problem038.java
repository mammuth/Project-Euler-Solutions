/**
 * Created by Max Muth on 24.08.14.
 * kontakt@maxi-muth.de
 * 932718654
 */
public class Problem038 extends EulerLibrary {

    public static void main(String[] args) {

        int max = 0;
        for (int p = 1; p < 10; p++) {

            String pan = "";
            for (int n = 1; pan.length() <= 9; n++) {
                pan += String.valueOf(n * p);

                if (pan.length() == 9 && !pan.contains("0") && Integer.valueOf(pan) > max && isPandigital(pan))
                    max = Integer.parseInt(pan);

            }

        }

        System.out.println(max);
    }
}
