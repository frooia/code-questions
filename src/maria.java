import java.util.*;
public class maria {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int length = iangay.nextInt();
            ArrayList<Integer> grannies = new ArrayList<>();
            int maxGrannies = 1;
            for (int j = 0; j < length; j++) { grannies.add(iangay.nextInt()); }
            Collections.sort(grannies);
            int lengthIndex = -1;
            for (int j = 0; j < length; j++) {
                if (grannies.get(j) <= length) { lengthIndex++; }
            }
            for (int j = lengthIndex; j >= 0; j--) {
                if (grannies.get(j) <= j + 1) {
                    break;
                }
            }
            /*
            HashSet<Integer> uniqueNums = new HashSet<>(grannies);
            Iterator<Integer> itr = uniqueNums.iterator();
            int index = -1;
            int toCheck = 0;
            while (itr.hasNext()) {
                int n = itr.next();
                int last = grannies.lastIndexOf(n);
                if (n <= maxGrannies) {
                    if (last + 1 < n || toCheck > 0) { toCheck += last - index; }
                    else {
                        System.out.print(maxGrannies + " (" + last + ") ");
                        maxGrannies += last - index;
                        index = last;
                    }
                }
                else { break; }
            }
             */
            System.out.println(maxGrannies);
        }
    }
}