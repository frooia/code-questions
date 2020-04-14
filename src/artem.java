import java.util.*;
public class artem {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int rows = iangay.nextInt(); int columns = iangay.nextInt();
            if ((rows * columns) % 2 == 1) {
                boolean black = true;
                for (int j = 0; j < rows; j++) {
                    for (int k = 0; k < columns; k++) {
                        if (black) { System.out.print("B"); black = false; }
                        else { System.out.print("W"); black = true; }
                    }
                    System.out.println();
                }
            }
            else {
                boolean blackRow = true; int[][] coloring = new int[rows][columns];
                for (int j = 0; j < rows; j++) {
                    boolean black = false; if (blackRow) { black = true; }
                    for (int k = 0; k < columns; k++) {
                        if (black) { coloring[j][k] = 0; black = false; }
                        else { coloring[j][k] = 1; black = true; }
                    }
                    if (blackRow) { blackRow = false; }
                    else { blackRow = true; }
                }
                if (coloring[rows-1][columns-1] == 1) { coloring[rows-1][columns-1] = 0; }
                else if (coloring[rows-1][0] == 1) { coloring[rows-1][0] = 0; }
                for (int j = 0; j < rows; j++) {
                    for (int k = 0; k < columns; k++) {
                        if (coloring[j][k] == 0) { System.out.print("B"); }
                        else { System.out.print("W"); }
                    }
                    System.out.println();
                }
            }
        }
    }
}
