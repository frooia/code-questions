import java.util.*;
public class deathnote {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int days = iangay.nextInt(), size = iangay.nextInt();
        int[] names = new int[days];
        for (int i = 0; i < days; i++) { names[i] = iangay.nextInt(); }
        long remainder = 0;
        for (int i = 0; i < days; i++) {
            remainder += names[i];
            if (remainder < size) { System.out.print(0+" "); }
            else {
                System.out.print(remainder / size+" ");
                remainder %= size;
            }
        }
    }
}