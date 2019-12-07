import java.text.DecimalFormat;
import java.util.*;
public class triforce {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        String [] output = new String [tc];
        for (int i = 0; i < tc;i++) {
            int s = in.nextInt();
            double t = in.nextDouble();
            int p = in.nextInt();
            double area = Math.pow(s, 2.0)*Math.sqrt(3.0)/4.0;
            double cost = p*Math.pow(0.75,t)*area;
            DecimalFormat df = new DecimalFormat("#.##");
            String out = "Triforce #"+(i+1)+": " + String.format("%.2f", cost);
            output[i]=out;
        }
        for (String x : output) {
            System.out.println(x);
        }
    }
}
