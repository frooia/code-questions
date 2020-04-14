import java.util.*;
public class beautiful {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i  = 0; i < tc; i++) {
            int n = iangay.nextInt(); int k = iangay.nextInt();
            int triangleNum = 0; int numTriangle = 0;
            while (triangleNum < k) {
                numTriangle++;
                triangleNum += numTriangle;
            } triangleNum -= numTriangle;
            StringBuilder word = new StringBuilder(String.join("", Collections.nCopies(n, "a")));
            word.setCharAt(n - numTriangle - 1, 'b');
            word.setCharAt(n - (k - triangleNum), 'b');
            System.out.println(word);
        }
    }
}
