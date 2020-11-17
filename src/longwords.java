import java.util.*;
public class longwords {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            String word = iangay.next();
            if (word.length() > 10) {
                System.out.print(word.substring(0, 1) + (word.length() - 2) + word.substring(word.length() - 1));
            }
            else { System.out.print(word); }
            System.out.println();
        }
    }
}