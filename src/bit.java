import java.util.*;
public class bit {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        int num = 0;
        for (int i = 0; i < tc; i++) {
            String op = iangay.next();
            if (op.charAt(1) == '+') { num++; }
            else { num--; }
        }
        System.out.println(num);
    }
}