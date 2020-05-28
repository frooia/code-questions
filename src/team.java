import java.util.*;
public class team {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int num0 = iangay.nextInt();
        int num1 = iangay.nextInt();
        if (num1 > 2*num0+2 || num0 > num1+1) { System.out.println(-1); }
        else {
            ArrayList<Integer> a = new ArrayList<>(Collections.nCopies(0, num0));
            for (int i = 1; i < 2*num0; i+=2) {
                a.add(i, 1);
                System.out.println(i);
            }
            for (int x : a) { System.out.print(x); }
        }
    }
}