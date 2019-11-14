import java.util.*;

public class PathCounter
{
    //remove blocked to get general path count method
    public static int path(int x, int y, int[][] lattice)
    {
        if (x == 0 && y == 0) { return 1; }
        if (lattice[x][y] == 1) { return 0; }
        int count = 0;
        if (x > 0) { count += path(x-1, y, lattice); }
        if (y > 0) { count += path(x, y-1, lattice); }
        return count;
    }
    public static void main(String [ ] args) {
        int x = 10;
        int y = 10;
        Scanner iangay = new Scanner(System.in);
        int numCases = iangay.nextInt();
        for (int i = 0; i < numCases; i++) {
            int[][] lattice = new int[x][y];
            for (int j = 0; j < x; j++) { for (int k = 0; k < y; k++) {lattice[j][k]=0;}} //initializes lattice with 0s
            int numBlocked = iangay.nextInt();
            for (int j = 0; j < numBlocked; j++) {
                int ob1 = iangay.nextInt();
                int ob2 = iangay.nextInt();
                lattice[y-ob2][x-ob1] = 1;
            }
            /*
            for (int [] n : lattice) { //prints array
                for (int m : n) { System.out.print(m+" "); }
                System.out.println();
            } */
            System.out.println(path(x-1, y-1, lattice));
        }
    }
}
