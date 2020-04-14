import java.util.*;
public class construct {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int length = iangay.nextInt(); int subLength = iangay.nextInt(); int diffLetters = iangay.nextInt();
            String str = "";
            for (int j = 0; j < diffLetters; j++) { str += (char)(97 + j);}
            System.out.println(str.repeat(length/diffLetters)+str.substring(0, length%diffLetters));
        }
    }
}