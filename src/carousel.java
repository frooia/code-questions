import java.util.*;
public class carousel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 0; i < tc; i++) {
            int numAnimals = in.nextInt(); int[] animals = new int[numAnimals];
            int[] coloring = new int[numAnimals];
            int colors = 1; int prevAnimal = -1; int prevColor = 1;
            for (int j = 0; j < numAnimals; j++) {
                animals[j] = in.nextInt(); coloring[j] = prevColor;
                if (animals[j] != prevAnimal && j != 0) {
                    if (colors == 1) { colors++; }
                    if (prevColor == 1) { coloring[j] = 2; }
                    else if (prevColor == 2) { coloring[j] = 1; }
                }
                prevAnimal = animals[j]; prevColor = coloring[j];
            }
            if (animals[0] != animals[numAnimals-1] && coloring[0] == coloring[numAnimals-1] && coloring[numAnimals-1] != coloring[1]) {
                colors++; coloring[numAnimals-1] = colors;
            }
            System.out.println(colors);
            for (int color : coloring) { System.out.print(color + " "); }
            System.out.println();
        }
    }
}
