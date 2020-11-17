import java.util.*;
public class unicorn {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < 10; i++) { s.add(iangay.nextInt() % 42); }
        System.out.println(s.size());
    }
}