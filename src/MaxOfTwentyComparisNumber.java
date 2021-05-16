import java.util.Scanner;

public class MaxOfTwentyComparisNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (number > 20 || number < 1) {
            System.out.println("Enter the quantity of numbers from one to twenty ");
            try {
                number = scanner.nextInt();
            } catch (Exception e) {
                scanner.next();
                System.out.println("invalid input, try again.");
            }
        }

        System.out.println("valid input! Quantity of compared numbers " + number);
        int[] mas = new int[number];
        int max = Integer.MIN_VALUE;


        for (int i = 0; i < mas.length; i++) {
            while (true) {
                try {
                    mas[i] = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    scanner.next();
                    System.out.println("invalid input");
                }
            }
        }
        for (int ma : mas) {
            max = Math.max(ma, max);
        }

        System.out.println("Max number " + max);

    }
}


