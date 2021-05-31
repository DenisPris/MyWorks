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
        System.out.println(Arrays.toString(numbers));

        File fileSortedRandNum = new File("sortedNumbers.txt");
        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fileSortedRandNum)));
        writer.println(Arrays.toString(numbers));
            writer.flush();
            writer.close();
        } catch (IOException exception){
            exception.printStackTrace();
        }
        scanner.close();






    }
}
