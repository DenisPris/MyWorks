import java.util.Scanner;

public class MaxOfTwentyComparisNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the quantity of numbers ");

        int a = s.nextInt();

        int[] mas = new int[a];
        int max = mas[0];

        System.out.println("Enter the numbers in massive: ");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = s.nextInt();
        }

        for (int i = 0; i < mas.length; i++) {
            max = Math.max(mas[i], max);

//           if (mas[i] > max)
//               max = mas[i];
        }

            System.out.println("Max number " + max);
//        System.out.println("Min number " + min);
        }
    }

