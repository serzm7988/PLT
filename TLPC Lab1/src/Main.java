import org.w3c.dom.Text;

import javax.management.Attribute;
import java.awt.font.TextAttribute;
import java.lang.reflect.Array;
import java.text.AttributedString;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Программная Инженерия\nПодгруппа 6\nМихайлов Сергей\nВариант 6\n");
        System.out.println("Задание 1\n    Префиксы: aaa\n    Суффиксы: aac\n    Подцепочки: aaa, aac, aca, caa\n    Вхождения символа: 0,1,2,4,5,6\n");
        System.out.println("Задание 2\n    Суффиксное свойство: L = {ab, abc, cmd}\n    Префиксное свойство: L = {cb, acd, dbc, cd}\n    Оба свойства: L = {ab, bc, cmd}\n");
        System.out.println("Задание 3\n    h(L) = {cⁿ aⁿ b²ⁿ|n1}\n");
        System.out.println("Задание 4\n");
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        String[] L1 = new String[n1];
        for(int i = 0; i < n1; i++) {
            L1[i] = input.next();
        }
        int n2 = input.nextInt();
        String[] L2 = new String[n2];
        String[]L1L2 = new String[n1*n2];
        for(int i = 0; i < n2; i++) {
            L2[i] = input.next();
        }
        for(int i = 0; i < n1; i++) {
            for(int j = 0; j < n2; j++) {
                L1L2[i*(n2-1)+j]=L1[i]+L2[j];
                System.out.print(L1L2[i*(n2-1)+j] + " ");
            }
        }
    }
}