import java.util.*;
public class icebreaker {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            String name = iangay.next(), obj = iangay.next();
            int score = 0;
            if (name.charAt(0) == obj.charAt(0)) { score+=2; }
            if (name.charAt(0) == obj.charAt(obj.length()-1)) { score++; }
            System.out.println(score);
        }
    }
}