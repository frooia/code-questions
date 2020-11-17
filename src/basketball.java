import java.util.*;
public class basketball {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        char[] s = iangay.next().toCharArray();
        int ascore = 0, bscore = 0;
        boolean ten = false;
        for (int i = 0; i < s.length; i+=2) {
            if (s[i] == 'A') { ascore += s[i+1] - '0'; }
            else { bscore += s[i+1] - '0'; }
            if (ascore == 10 && bscore == 10) { ten = true; }
        }
        if (ten) {
            if (ascore - bscore >= 2) { System.out.println("A"); }
            else if (bscore - ascore >= 2) { System.out.println("B"); }
        }
        else {
            if (ascore > bscore) { System.out.println("A"); }
            else { System.out.println("B"); }
        }
    }
}