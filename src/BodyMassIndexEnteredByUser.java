import java.util.Scanner;

public class BodyMassIndexEnteredByUser {
    public static final double MAX_WEIGHT = 500;
    public static final double MAX_HEIGHT = 260;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your weight in kilogram: ");

        double weight = 0;
        while (weight > MAX_WEIGHT || weight < 1) {
            try {
                weight = scanner.nextDouble();
                System.out.println("Your weight " + weight);
            } catch (Exception e) {
                scanner.next();
                System.out.println("Incorrectly entered weight.");
            }
        }
        System.out.println("Input your height in metres: Ex. 1,73 centimeters.");
        double height = 0;
        while (height > MAX_HEIGHT || height < 1) {
            try {
                height = scanner.nextDouble();
                System.out.println("Your height " + height);
            } catch (Exception e) {
                scanner.next();
                System.out.println("incorrectly entered height. \n Ex. 1,73 centimeters.");
            }
        }
        double bodyMassIndex = weight / (height * height);
        System.out.println("Your BMI = " + bodyMassIndex + ".");
        if (bodyMassIndex < 16.5) {
            System.out.println("Doctor's recommendation: Two Big Macs a day and a couple of beers, more. But no less!");
        }
        if (16.5 >= bodyMassIndex && bodyMassIndex <= 18.4) {
            System.out.println("Doctor's recommendation: Meet up with friends at the beer bar more often.");
        }
        if (bodyMassIndex >= 18.5 && bodyMassIndex <= 24.9) {
            System.out.println("Doctor say: You are okay. You have a chance to live to be 70 years old. \n ");
        }
        if (bodyMassIndex >= 25 && bodyMassIndex <= 29.9) {
            System.out.println("You need to walk more.");
        }
        if (bodyMassIndex >= 30 && bodyMassIndex <= 34.9) {
            System.out.println("Drink more water and more walking.");
        }
        if (bodyMassIndex >= 35 && bodyMassIndex <= 40) {
            System.out.println("Drink water, eat water..");
        }
        if (bodyMassIndex > 40) {
            System.out.println("Hello! Is it 911?..." + "\n 911:Yes, How we can help you?" + "\n Great.. I want 12 chicken mcnuggets and two can cola!");
        }
        System.out.println("BMI Categories:\n" +
                "Underweight = <18.5\n" +
                "Normal weight = 18.5–24.9\n" +
                "Overweight = 25–29.9\n" +
                "Obesity = BMI of 30 or greater");
        scanner.close();
    }
}
