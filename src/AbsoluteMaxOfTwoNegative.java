/*
Show two random numbers and show greatest by absolute value.
Numbers can be negative.
 */
public class AbsoluteMaxOfTwoNegative {
    public static void main(String[] args) {
        int min = -10;
        int mathRand = min + (int) (Math.random() * 20);
        int mathRand2 = min + (int) (Math.random() * 20);
        System.out.println("Это рандомное число 1 " + mathRand);
        System.out.println("Это рандомное число 2 " + mathRand2);

        if (Math.abs(mathRand) > Math.abs(mathRand2)) {
            System.out.println(mathRand + " Its greatest number");
        }
        else {
            System.out.println(mathRand2 + " Its greatest number");
        }
    }
}
