import java.util.*;
public class pasha {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        long n = iangay.nextInt();
        if (n%2 != 0) { System.out.println(0); }
        else if (n%4 == 0) { System.out.println(n/4-1); }
        else { System.out.println(n/4); }
    }
}