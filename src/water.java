import java.util.*;
public class water {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int hot = iangay.nextInt();
            int cold = iangay.nextInt();
            int desired = iangay.nextInt();
            int temp = hot; int cups = 1;
            if (desired <= (hot + cold) / 2) {
                System.out.println(2);
            }
            else {
                double diff = Math.abs(desired - temp);
                double newdiff;
                do {
                    temp = (temp * cups + hot + cold) / (cups + 2);
                    cups += 2;
                    newdiff = Math.abs(desired - temp);
                } while (newdiff < diff);
            }
        }
    }
}