import com.sun.source.util.SourcePositions;

import javax.swing.*;
import java.sql.SQLOutput;
/*
Вывести два ранд. числа, затем вывести бльшое из них
 */

public class MaxOfTwo {
    public static void main(String[] args) {
        int mathRand = (int) (Math.random()*100);
        int mathRand2 = (int) (Math.random()*100);
        System.out.println("Это рандомное число 1 :" + mathRand);
        System.out.println("Это рандомное число 2 :" + mathRand2);
        if (mathRand2 < mathRand) {
            System.out.println(mathRand + " больше");}
        else System.out.println(mathRand2 + " больше");
    }
}
