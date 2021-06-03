import java.io.*;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SortNumbersFromFile2 {
    private static final String INPUT_FILE_NAME = "randomNumber.txt";
    private static final String OUTPUT_FILE_NAME = "resultSortedNumber.txt";

    public static void main(String[] args) throws IOException {
        TreeMap<Long, Integer> integerTreeMap = new TreeMap<>();
        Scanner scanner = new Scanner(new File(INPUT_FILE_NAME));
        Writer writer = new FileWriter(OUTPUT_FILE_NAME);
        while (scanner.hasNextLong()) {
            final Long key = scanner.nextLong();
            final Integer quantityDuplicate = integerTreeMap.get(key);
            if (quantityDuplicate == null) {
                integerTreeMap.put(key, 1);
            } else {
                integerTreeMap.put(key, quantityDuplicate + 1);
            }
        }
        System.out.println(integerTreeMap.size());

        for (Map.Entry<Long, Integer> entry : integerTreeMap.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                System.out.println(entry.getKey());
                writer
                        .append(String.valueOf(entry.getKey()))
                        .append(" ");

            }
        }
        writer.close();

    }
}
