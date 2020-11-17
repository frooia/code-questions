import java.util.*;
public class theater {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = iangay.nextInt();
            int m = iangay.nextInt();
            int cost1 = iangay.nextInt();
            int cost2 = iangay.nextInt();
            int num1 = 0; int num2 = 0;
            char[][] theater = new char[n][m];
            for (int j = 0; j < n; j++) {
                theater[j] = iangay.next().toCharArray();
                boolean isPair = false;
                for (int k = 0; k < m; k++) {
                    if (theater[j][k] == '.') {
                        if (k > 0 && theater[j][k - 1] == '.' && !isPair) {
                            num2++;
                            num1--;
                            isPair = true;
                        } else {
                            num1++;
                            isPair = false;
                        }
                    }
                }
            }
            System.out.println((int)Math.min(num1 * cost1 + num2 * cost2, cost1 * (num1 + 2 * num2)));
        }
    }
}