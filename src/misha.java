import java.util.*;
public class misha {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int numChanges = iangay.nextInt();
        String[][] changes = new String[numChanges][2];
        for (int i = 0; i < numChanges; i++) {
            changes[i][0] = iangay.next();
            changes[i][1] = iangay.next();
        }
        ArrayList<String> handles = new ArrayList<>(numChanges);
        ArrayList<String> init = new ArrayList<>();
        for (int i = 0; i < numChanges; i++) {
            int index = handles.indexOf(changes[i][0]);
            if (index == -1) {
                init.add(changes[i][0]);
                handles.add(changes[i][0]);
            }
            handles.add(changes[i][1]);
        }
        System.out.println(init.size());
        DSU dsu = new DSU(handles.size());
        for (String[] change : changes) {

        }
    }
}