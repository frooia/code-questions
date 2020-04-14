import java.util.*;
public class polyhedrons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int polyNum = in.nextInt();
        int faceCount = 0;
        for (int i = 0; i < polyNum; i++) {
            String polyhedron = in.next();
            switch (polyhedron) {
                case "Tetrahedron":
                    faceCount += 4;
                    break;
                case "Cube":
                    faceCount += 6;
                    break;
                case "Octahedron":
                    faceCount += 8;
                    break;
                case "Dodecahedron":
                    faceCount += 12;
                    break;
                case "Icosahedron":
                    faceCount += 20;
                    break;
            }
        }
        System.out.println(faceCount);
    }
}
