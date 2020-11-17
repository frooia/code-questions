import java.util.*;
public class taxi {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int length = iangay.nextInt();
        int num1 = 0, num2 = 0, num3 = 0, taxis = 0;
        for (int i = 0; i < length; i++) {
            int group = iangay.nextInt();
            if (group == 1) { num1++; }
            else if (group == 2) { num2++; }
            else if (group == 3) { num3++; }
            else { taxis++; }
        }
        int diff1 = Math.min(num1, num3);
        taxis += diff1;
        num1 -= diff1; num3 -= diff1;
        taxis += num2 / 2;
        num2 %= 2;
        taxis += num3;
        taxis += Math.ceil((num1 + 2 * num2) / 4.0);
        System.out.println(taxis);
    }
}