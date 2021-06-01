import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/*
Sort the numbers from the file in order.
Write the result to a new file.
 */
public class SortNumbersFromFile {
    public static void main(String[] args) throws IOException {

        File fileRandomNum = new File("randomNumber.txt");

        Scanner scanner = new Scanner(fileRandomNum);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");

        long[] numbers = new long[2000];
        int counter = 0;

        for (String number : numbersString) {
            numbers[counter++] = Long.parseLong(number);
        }
        Arrays.sort(numbers);

        File fileSortedRandNum = new File("sortedNumbers.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileSortedRandNum));
        for (int i = 0; i < numbers.length; i++) {
            bufferedWriter.write(numbers[i] + " ");
        }
        scanner.close();


    }
}
