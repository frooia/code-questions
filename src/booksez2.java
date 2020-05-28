import java.util.*;
public class booksez2 {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int kids = iangay.nextInt();
            int[] books = new int[kids];
            for (int j = 0; j < kids; j++) {
                books[j] = iangay.nextInt() - 1;
            }
            DSU dsu = new DSU(kids);
            for (int j = 0; j < kids; j++) {
                dsu.union(j, books[j]);
            }
            for (int j = 0; j < kids; j++) {
                System.out.print(dsu.sizes[dsu.find(books[j])]+" ");
            }
            System.out.println();
        }
    }
}
