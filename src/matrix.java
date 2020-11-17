import java.util.*;
public class matrix {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int rows = iangay.nextInt(), cols = iangay.nextInt();
            int[][] game = new int[rows][cols];
            HashMap<Integer, Integer> map = new HashMap<>();
            ArrayList<Integer> open = new ArrayList<>();
            for (int i = 0; i < Math.min(rows, cols); i++) { open.add(i); }
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    game[i][j] = iangay.nextInt();
                    if (game[i][j] == 1) {
                        map.put(i, j);
                        if (rows < cols) { open.remove(Integer.valueOf(j)); }
                        else { open.remove(Integer.valueOf(i)); }
                    }
                }
            }
            int moves = 0;
            for (int i = 0; i < Math.min(rows, cols); i++) {
                if (rows < cols && !map.containsKey(i)) {
                    moves++;
                }
                else if (rows >= cols && !map.containsValue(i)) {
                    moves++;
                }
            }
            if (moves%2 == 0) { System.out.println("Vivek"); }
            else { System.out.println("Ashish"); }
        }
    }
}