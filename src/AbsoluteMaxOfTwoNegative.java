/*
Show two random numbers and show greatest by absolute value.
Numbers can be negative.
 */
public class AbsoluteMaxOfTwoNegative {
    public static void main(String[] args) {
        int min = -10;
        int mathRand = min + (int) (Math.random() * 20);
        int mathRand2 = min + (int) (Math.random() * 20);
        System.out.println("Мы это " + mathRand);
        System.out.println(" сравниваем с этим " + mathRand2);
        System.out.println(Math.max(mathRand, mathRand2));


/*
        if (Math.abs(mathRand) > Math.abs(mathRand2)) {
            System.out.println(mathRand + " Its greatest number  by absolute value");
        }
        else {
            System.out.println(mathRand2 + " Its greatest number  by absolute value");
        }
    }
*/
    }
}
