import java.util.Scanner;

public class Vacuuming {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 0; i < tc;i++) {
            int objCount = in.nextInt();
            int [] space = new int[objCount];
            int k = 0;
            for (int j = 0; j < objCount; j++) {
                space[j] = 0;
                int obj = in.nextInt();
                if (obj != 0) {
                    space[k] = obj;
                    k++;
                }
                System.out.print(space[j] + " ");
            }
            System.out.println();
        }
    }
}
