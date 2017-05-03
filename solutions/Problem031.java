/**
 * Created by Max Muth on 21.08.14.
 * kontakt@maxi-muth.de
 * <p/>
 * How many different ways can £2 be made using any number of coins?
 * <p/>
 * (hm.. this tastes like BruteForce. not. but...)
 */
public class Problem031 {

    public static void main(String[] args) {

        int target = 200;
        int ways = 0;

        for (int a = target; a >= 0; a -= 200) {
            for (int b = a; b >= 0; b -= 100) {
                for (int c = b; c >= 0; c -= 50) {
                    for (int d = c; d >= 0; d -= 20) {
                        for (int e = d; e >= 0; e -= 10) {
                            for (int f = e; f >= 0; f -= 5) {
                                for (int g = f; g >= 0; g -= 2) {
                                    ways++;
                                }
                            }
                        }
                    }
                }
            }
        }

        // Kind of art, huh? And horror regarding runtime :D

        System.out.println(ways);
    }
}
