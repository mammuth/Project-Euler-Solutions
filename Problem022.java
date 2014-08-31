import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max Muth on 18.08.14.
 * kontakt@maxi-muth.de
 * <p/>
 * Name Scores
 * Attachment is Problem022_names.txt
 * Solution: 871198282
 */

public class Problem022 {

    private static List<String> names = new ArrayList<String>();

    public static void main(String[] args) throws IOException {

        readAndSortNames();

        long sum = 0;
        for (int i = 1; i <= names.size(); i++) {
            sum += nameScore(names.get(i - 1), i);
        }

        System.out.println(sum);

    }


    private static int nameScore(String name, int position) {
        int nameScore = 0;

        for (int i = 0; i < name.length(); i++) {
            nameScore += name.charAt(i) - 64;
        }

        return nameScore * position;
    }

    private static void readAndSortNames() throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get("Problem022_names.txt"));
        String[] s = new String(encoded, StandardCharsets.UTF_8).split(",");

        for (String a : s) {
            names.add(a.replaceAll("\"", "").trim());
        }

        java.util.Collections.sort(names);
    }

}
