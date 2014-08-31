/**
 * Created by Max Muth on 07.08.14.
 * kontakt@maxi-muth.de
 * <p/>
 * Solution: 31875000
 */
public class Problem009 {
    public static void main(String[] args) {

        for (int a = 1; a < 1000; a++)
            for (int b = a; b < 1000; b++)
                for (int c = b; c < 1000; c++)

                    if (a * a + b * b == c * c && a + b + c == 1000) {
                        System.out.println(a + ", " + b + ", " + c + "\na*b*c = " + a * b * c);
                        break;
                    }


    }
}