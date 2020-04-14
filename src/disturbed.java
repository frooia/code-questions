import java.io.*;
import java.util.*;
public class disturbed {
    private static boolean isDisturbed(String[] flats, int i) {
        return i > 0 && i < flats.length - 1 && flats[i].equals("0") && flats[i-1].equals("1") && flats[i+1].equals("1");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int flatNum = Integer.parseInt(br.readLine());
        String[] flats = br.readLine().split(" ");
        ArrayList<Integer> disturbed = new ArrayList<>();
        int putOut = 0;
        if (flatNum > 2) {
            for (int i = 1; i < flatNum - 1; i++) {
                if (isDisturbed(flats, i)) { disturbed.add(i); }
            }
            int i = 0;
            while (i < disturbed.size()) {
                if (i < disturbed.size()-1 && disturbed.get(i+1) - disturbed.get(i) == 2 && flats[disturbed.get(i)+1].equals("1")) { i += 2; }
                else { i++; }
                putOut++;
            }
            System.out.println(putOut);
        }
        else { System.out.println(0); }
    }
}
