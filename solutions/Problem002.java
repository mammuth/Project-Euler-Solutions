import java.util.ArrayList;

/**
 * Created by mammuth on 04.08.14.
 * <p/>
 * Solution: 4613732
 */
public class Problem002 {
    private static ArrayList<Integer> fibonacciSequence = new ArrayList<Integer>();
    private static int a = 1;
    private static int b = 2;

    public static void main(String[] args) {
        fibonacciSequence.add(a);
        fibonacciSequence.add(b);

        getFibonacci(a, b);
        System.out.println("Sum of all even Fibonacci Terms < 4.000.000 is " + getSumOfEvenElements(fibonacciSequence));
    }

    private static void getFibonacci(int a, int b) {
        int c = a + b;
        if (c > 4000000) {
            return;
        } else {
            fibonacciSequence.add(c);
            getFibonacci(b, c);
        }
    }

    private static int getSumOfEvenElements(ArrayList<Integer> l) {
        ArrayList<Integer> m = new ArrayList<Integer>(); //speichert die Geraden
        int sum = 0;
        for (int i : l) {
            if (i % 2 == 0) {
                m.add(i);
            }
        }
        for (int i : m) {
            sum += i;
        }
        return sum;
    }
}
