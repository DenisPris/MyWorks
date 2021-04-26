public class CompareNumByLibraMethod {
    public static void main(String[] args) {
        int firstNum = 30;
        int secondNum = 50;
        System.out.println("We compared first and second number. This is result " + Integer.compare(firstNum, secondNum));

        int thirdNum = 30;
        int fourthNum = 30;
        System.out.println("We compared third and fourth number. This is result " + Integer.compare(thirdNum, fourthNum));

        int fifth = 50;
        int sixth = 30;
        System.out.println("We compared fifth and sixth number. This is result " + Integer.compare(fifth,sixth));
    }
}
