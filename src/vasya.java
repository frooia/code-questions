import java.util.*;
public class vasya {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int socks = in.nextInt(); int mama = in.nextInt();
        int days = 0;
        while (socks != 0) {
            days++; socks--;
            if (days % mama == 0) { socks++; }
        }
        System.out.println(days);
    }
}
