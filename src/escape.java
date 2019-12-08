import java.util.Scanner;

public class escape {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        int [] output = new int [tc];
        for (int i = 0; i < tc;i++) {
            int s = in.nextInt();
            int t = in.nextInt();
            int p = in.nextInt();
            output[i]= (int) ((int)Math.pow(s,3)+Math.pow(t,3)+Math.pow(p,3));
        }
        for (int x : output) {
            System.out.println(x);
        }
    }
}
