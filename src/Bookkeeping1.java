import java.util.Scanner;

public class Bookkeeping1 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 0; i < tc;i++) {
            int bookcases = in.nextInt(); int queries = in.nextInt();
            int [] books = new int [bookcases];
            for (int j = 0; j < bookcases; j++) { books[j] = in.nextInt(); }
            for (int j = 0; j < queries; j++) {
                int start = in.nextInt() - 1; int end = in.nextInt() - 1; int q = 0;
                for (int k = start; k <= end; k++) { q += books[k]; }
                System.out.println(q);
            }
        }
    }
}
