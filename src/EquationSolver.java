import java.text.DecimalFormat;
import java.util.*;
public class EquationSolver
{
    public static void main(String [ ] args)
    {
        Scanner iangay = new Scanner(System.in);
        int numCases = iangay.nextInt();
        for (int i = 0; i < numCases; i++) {
            double n = iangay.nextDouble();
            double t = Math.floor(Math.log(n)/Math.log(2.0));
            while (t < Math.ceil(Math.log(n)/Math.log(2.0)) && (Math.pow(2, t)+Math.pow(t,2)) < n) {
                t += 0.0001;
            }
            DecimalFormat df = new DecimalFormat("#.###");
            System.out.format("%.3f", t);
        }
    }
}