import java.lang.reflect.Array;
import java.util.*;
public class binary {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            char[] string = iangay.next().toCharArray();
            boolean allSame = true; boolean alternate = true;
            for (int j = 0; j < string.length-1; j++) {
                if (string[j] != string[j+1]) { allSame = false; }
                if (j < string.length-2 && string[j] != string[j+2]) { alternate = false; }
            }
            if (allSame || alternate) {
                for (char a : string) { System.out.print(a); }
            }
            else {
                ArrayList<Character> newstring = new ArrayList<>();
                for (int j = 0; j < string.length-1; j++) {
                    newstring.add(string[j]);
                    if (string[j] == string[j+1]) {
                        if (string[j] == '0') { newstring.add('1'); }
                        else { newstring.add('0'); }
                    }
                }
                newstring.add(string[string.length-1]);
                for (char a : newstring) { System.out.print(a); }
            }
            System.out.println();
        }
    }
}