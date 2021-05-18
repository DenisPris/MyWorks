//Записать в новый файл запрошенное пользователем количество случайных чисел.
//
//Чисел не может быть больше 2 тысяч.
//Числа могут быть отрицательные.
//Числа по модулю не должны превышать 2 триллиона.
//Числа по модулю должны быть больше 5 миллиардов.
//Числа в файле должны быть разделены пробелом.

import java.io.*;
import java.util.Scanner;

public class GenerateToFileRandomNumber {
    public static final int MAX_QUANTITY_OF_NUMBERS = 2000;
    public static final long MIN_NUMBER = 5_000_000_000L * -1;
    public static final long MAX_NUMBER = 2_000_000_000_000L;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int quantityOfNumbers = 0;
        System.out.println("Enter the quantity of numbers .");


        while (quantityOfNumbers > MAX_QUANTITY_OF_NUMBERS || quantityOfNumbers < 1) {
            try {
                quantityOfNumbers = scanner.nextInt();
            } catch (Exception e) {
                scanner.next();
                System.out.println("Invalid input! Please try again..");
            }
        }

        System.out.println("Valid input! Quantity " + quantityOfNumbers + " will be generate tou our file.");

        File myFile = new File("randomNumber.txt");


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(myFile, true));
        for (int i = 0; i < quantityOfNumbers; i++) {
            long mathRand = MIN_NUMBER + (long) (Math.random() * MAX_NUMBER);
            bufferedWriter.write(mathRand + "\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();


    }
}