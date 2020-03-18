import java.io.*;
import java.util.*;
public class polygon {
    public static void main(String [] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 0; i < tc; i++) {
            int initV = in.nextInt();
            int buildV = in.nextInt();
            if (initV > buildV && initV % buildV == 0) { System.out.println("YES"); }
            else { System.out.println("NO"); }
        }
    }
}
