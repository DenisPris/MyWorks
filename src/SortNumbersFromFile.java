import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Sort the numbers from the file in order.
Write the result to a new file.
 */
public class SortNumbersFromFile {
    private static final String INPUT_FILE_NAME = "randomNumber.txt";
    private static final String OUTPUT_FILE_NAME = "resultSortedNumber.txt";

    public static void main(String[] args) throws IOException {
        List<Long> longArrayList = new ArrayList<>(); // инициализация списка
        try (Scanner scanner = new Scanner(new File(INPUT_FILE_NAME)); // открытие файла сканером
             Writer writer = new FileWriter(OUTPUT_FILE_NAME)) { // открытие нового файла Writer'ом
            while (scanner.hasNextLong()) { // проверка на наличик следующего числа
                longArrayList.add(scanner.nextLong()); // чтение следующего числа и укладываение в список
            }
            longArrayList.sort(Long::compareTo); // сотрировка
            for (long number : longArrayList) { // проход циклом по числам в списке
                writer
                        .append(String.valueOf(number)) // запись числа в файл
                        .append(" "); // запись пробела в файл
            }
        }
    }
}
