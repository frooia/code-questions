import java.util.*;
public class distribution {
    public static boolean allEqual(ArrayList<Character> a) {
        return Collections.max(a) == Collections.min(a);
    }
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int length = iangay.nextInt();
            int numSplit = iangay.nextInt();
            char[] chars = iangay.next().toCharArray();
            Arrays.sort(chars);
            String[] strings = new String[numSplit];
            for (int j = 0; j < numSplit; j++) { strings[j] = ""+chars[j]; }
            if (!strings[0].equals(strings[numSplit - 1])) {
                System.out.println(strings[numSplit-1]);
            }
            else {
                boolean equal = true;
                for (int j = numSplit; j < length-1; j++) {
                    if (chars[j] != chars[j+1]) {
                        equal = false;
                        break;
                    }
                }
                if (equal) {
                    int index = 0;
                    for (int j = numSplit; j < length; j++) {
                        strings[index] += chars[j];
                        index = (index + 1) % numSplit;
                    }
                    System.out.println(strings[0]);
                }
                else {
                    System.out.print(strings[0]);
                    for (int j = numSplit; j < length; j++) {
                        System.out.print(chars[j]);
                    }
                    System.out.println();
                }
            }
        }
    }
}