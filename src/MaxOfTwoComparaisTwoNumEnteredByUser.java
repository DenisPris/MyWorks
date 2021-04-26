import java.util.Scanner;

public class MaxOfTwoComparaisTwoNumEnteredByUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number- ");
        int firstNum = sc.nextInt();
        System.out.println("Enter second number- ");
        int secondNum = sc.nextInt();

        if (firstNum > secondNum) {
            System.out.println("The first entered number " + firstNum + " is greater.");
        } else {
            System.out.println("The second entered number "+ secondNum + " is greater");
        }
    }
}
