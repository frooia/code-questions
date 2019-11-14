import java.util.*;
public class LabelSorter
{
    public static void main(String [ ] args)
    {
        Scanner iangay = new Scanner(System.in);
        int numCases = iangay.nextInt();
        for (int i = 0; i < numCases; i++) {
            int numLabels = iangay.nextInt();
            String[][] labels = new String[numLabels][2];
            for (int j = 0; j < numLabels; j++) {
                labels[j][0] =iangay.next();
                labels[j][1] = iangay.nextLine();
            }
            Arrays.sort(labels, new Comparator<String[]>() {
                @Override
                public int compare(String[] o1, String[] o2) {
                    if (o1[1].compareTo(o2[1]) > 0) { return 1; }
                    else if (o1[1].compareTo(o2[1]) == 0) {
                        if (o1[0].compareTo(o2[0]) > 0) { return 1; }
                        return -1;
                    }
                   return -1;
                }
            });
            for (int j = 0; j < numLabels; j++) {
                System.out.println(labels[j][0] + labels[j][1]);
            }
        }
    }
}
