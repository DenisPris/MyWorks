import java.util.Scanner;

public class MaxOfTwentyComparisNumber {
    public static void main(String[] args) {
        System.out.println("Enter the quantity of numbers from one to twenty ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number <= 20) {
            System.out.println("valid input! " + number);

            int[] mas = new int[number];
            int max = mas[0];

            System.out.println("Enter the numbers in massive: ");
            for (int i = 0; i < mas.length; i++) {
                mas[i] = scanner.nextInt();
            }

            for (int i = 0; i < mas.length; i++) {
                max = Math.max(mas[i], max);

//           if (mas[i] > max)
//               max = mas[i];
            }

            System.out.println("Max number " + max);
//        System.out.println("Min number " + min);
        }
        else {
            System.out.println("invalid input! ");
        }
    }
}

