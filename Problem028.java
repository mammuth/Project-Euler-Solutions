/**
 * Created by Max Muth on 19.08.14.
 * kontakt@maxi-muth.de
 */
public class Problem028 {

    /**
     * n = matrix size
     * Then values of the corners:
     * top-right n^2
     * top-left n^2 - (n-1)
     * bottom-left n^2 - 2*(n-1)
     * bottom-right n^2 - 3*(n-1)
     * → sum of all 4 corners: sum = 4n^2 - 6(n-1)
     */

    private static final int SIZE = 1001;

    public static void main(String[] args) {

        int sum = 1; // starting one in the middle
        
        for (int n = 3; n <= SIZE; n += 2) {

            int corners = (int) (4 * n * n - 6 * (n - 1));
            sum += corners;

        }

        System.out.println(sum);

    }
}
