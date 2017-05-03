/**
 * Created by Max Muth on 21.08.14.
 * kontakt@maxi-muth.de
 */
public class Problem035 extends EulerLibrary {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 2; i < 1000000; i++) {

            boolean isCircular = true;
            for (int p : rotations(i)) {
                if (!isPrime(p)) {
                    isCircular = false;
                    break;
                }
            }

            if (isCircular)
                sum++;
        }

        System.out.println(sum);

    }


}
