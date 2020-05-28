import java.util.*;
public class permutation {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int length = iangay.nextInt();
            ArrayList<Integer> perm = new ArrayList<>(length);
            boolean isPerm = true;
            for (int j = 0; j < length; j++) { perm.add(iangay.nextInt()); }
            int done = 0; int index = length;
            while (done < length && index >= 0) {
                if (perm.indexOf(done+1) > index) { isPerm = false; break; }
                List<Integer> sublist = new ArrayList<>(perm.subList(perm.indexOf(done+1), index));
                Collections.sort(sublist);
//                for (int x : sublist) { System.out.print(x+" "); }
//                System.out.println();
//                for (int x : perm.subList(perm.indexOf(done+1), index)) { System.out.print(x+" "); }
//                System.out.println();
                if (!sublist.equals(perm.subList(perm.indexOf(done+1), index))) {
                    isPerm = false; break;
                }
                done += sublist.size();
                index -= sublist.size();
            }
            if (isPerm) { System.out.println("Yes"); }
            else { System.out.println("No"); }
        }
    }
}