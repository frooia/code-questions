import java.util.*;
public class skier {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            char[] directions = iangay.next().toCharArray();
            int time = directions.length * 5;
            int x = 0, y = 0;
            ArrayList<int[]> paths = new ArrayList<>(); // [prevX, prevY, newX, newY]
            for (char a : directions) {
                int newX = x, newY = y;
                if (a == 'N') { newY++; }
                else if (a == 'S') { newY--; }
                else if (a == 'W') { newX--; }
                else { newX++; }
                int[] array = new int[]{x, y, newX, newY};
                if (!paths.contains(array) && !paths.contains(new int[]{newX, newY, x, y})) {
                    paths.add(array);
                    System.out.println("("+x+", "+y+") -> ("+newX+", "+newY+")");
                }
                else { System.out.println("Bad"); }
                x = newX; y = newY;
            }
            time -= 4 * (directions.length - paths.size());
            System.out.println(time);
        }
    }
}