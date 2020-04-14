import java.math.BigInteger;
import java.util.*;
public class karatsuba {
    private static BigInteger multiply(String x, String y) {
        if (x.length() == 1 || y.length() == 1) {
            BigInteger product = new BigInteger(String.valueOf(Long.parseLong(x) * Long.parseLong(y)));
            System.out.println(x+" * "+y+" = "+ product);
            return product;
        }
        String a = x.substring(0, (int)Math.ceil(x.length()/2.0)); String b = x.substring((int)Math.ceil(x.length()/2.0));
        String c = y.substring(0, (int)Math.ceil(y.length()/2.0)); String d = y.substring((int)Math.ceil(y.length()/2.0));
        System.out.println(a+" "+b+" "+c+" "+d);
        BigInteger ac = multiply(a, c);
        BigInteger bd = multiply(b, d);
        BigInteger preGauss = multiply(new BigInteger(a).add(new BigInteger(b))+"", new BigInteger(c).add(new BigInteger(d))+"").subtract(ac.add(bd));
        System.out.println(ac+" "+bd+" "+preGauss);
        BigInteger product = new BigInteger(String.valueOf(new BigInteger(String.valueOf((long)Math.pow(10, x.length()))).multiply(ac).add(new BigInteger(String.valueOf((long)Math.pow(10, x.length()/2))).multiply(preGauss).add(bd))));
        System.out.println(x+" * "+y+" = "+product);
        return product;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.next();
        String y = in.next();
        System.out.println(multiply(x, y));
    }
}
