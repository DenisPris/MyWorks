
public class AbsoluteMaxOfTwoNegative {
    public static void main(String[] args) {
        int min = -10;
        int mathRand = min + (int) (Math.random() * 20);
        int mathRand2 = min + (int) (Math.random() * 20);
        System.out.println("We compare this " + mathRand);
        System.out.println("with this  " + mathRand2);
        System.out.println("This is greatest number " + Math.max(mathRand, mathRand2));
    }
}