import java.util.*;
public class again {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        char[] word = iangay.next().toCharArray();
        System.out.println(Integer.parseInt(String.valueOf(word[6])) % 2);
    }
}
