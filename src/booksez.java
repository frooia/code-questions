import java.util.*;
public class booksez {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int kids = iangay.nextInt();
            int[] books = new int[kids];
            for (int j = 0; j < kids; j++) { books[j] = iangay.nextInt() - 1; }
            // Integer[] days = new Integer[kids]; Collections.nCopies(kids, -1).toArray(days);
            for (int j = 0; j < kids; j++) {
                int steps = 1; int next = books[j];
                while (next != j) { steps++; next = books[next]; }
                // days[j] = steps;
                System.out.print(steps+" ");
            }
            System.out.println();
        }
    }
}
