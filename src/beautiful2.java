import java.util.*;
public class beautiful2 {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int length = iangay.nextInt();
            int subLength = iangay.nextInt();
            ArrayList<Integer> init = new ArrayList<>();
            for (int j = 0; j < length; j++) {
                init.add(iangay.nextInt());
            }
        }
    }
}