import java.util.*;
public class anton2 {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        String str = iangay.nextLine();
        str = str.substring(1, str.length() - 1);
        HashSet<String> letters = new HashSet<>(Arrays.asList(str.split(", ")));
        if (str.length() != 0) { System.out.println(letters.size()); }
        else { System.out.println(0); }
    }
}