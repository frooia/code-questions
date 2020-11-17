import java.util.*;
public class christmas {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            double h = iangay.nextInt(), r = iangay.nextInt(), l = iangay.nextInt();
            System.out.println(Math.sqrt(l*l - h*h) / (2*r*Math.PI));
        }
    }
}