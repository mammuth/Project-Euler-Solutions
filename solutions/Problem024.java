import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max Muth on 18.08.14.
 * kontakt@maxi-muth.de
 */
public class Problem024 {

    private static List<String> list = new ArrayList<String>();

    public static void main(String[] args) {

        permutation("", "0123456789");
        System.out.println(list.get(1000000 - 1));

    }

    private static void permutation(String prefix, String str) {

        int l = str.length();
        if (l == 0) {
            list.add(prefix);
        } else {
            for (int i = 0; i < l; i++)
                // To infinity (and even further)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, l));
        }
    }

}
