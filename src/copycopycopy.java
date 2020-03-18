import java.util.*;
public class copycopycopy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 0; i < tc; i++) {
            int length = in.nextInt();
            HashSet<Long> set = new HashSet<>();
            for (int j = 0; j < length; j++) {
                set.add(in.nextLong());
            }
            System.out.println(set.size());
        }
    }
}
