import java.util.Scanner;

public class Bookkeeping2 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 0; i < tc;i++) {
            int rows = in.nextInt(); int columns = in.nextInt(); int queries = in.nextInt();
            int [] [] books = new int[rows][columns];
            for (int j = 0; j < rows; j++) { for (int k = 0; k < columns; k++) { books[j][k] = in.nextInt(); } }
            for (int j = 0; j < queries; j++) {
                int r1 = in.nextInt() - 1; int c1 = in.nextInt() - 1; int r2 = in.nextInt() - 1; int c2 = in.nextInt() - 1; int q = 0;
                for (int k = r1; k <= r2; k++) { for (int l = c1; l <= c2; l++) { q += books[k][l]; } }
                System.out.println(q);
            }
        }
    }
}
