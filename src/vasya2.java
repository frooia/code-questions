import java.util.*;
public class vasya2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vectors = in.nextInt();
        int xTotal = 0; int yTotal = 0; int zTotal = 0;
        for (int i = 0; i < vectors; i++) { xTotal += in.nextInt(); yTotal += in.nextInt(); zTotal += in.nextInt(); }
        if (xTotal == 0 && yTotal == 0 && zTotal == 0) { System.out.println("YES"); }
        else { System.out.println("NO"); }
    }
}
