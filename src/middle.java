import java.util.*;
public class middle {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int popSize = iangay.nextInt(); int minBurles = iangay.nextInt();
            int[] people = new int[popSize]; long excess = 0; int wealthy = 0;
            for (int j = 0; j < popSize; j++) {
                people[j] = iangay.nextInt() - minBurles;
                if (people[j] >= 0) { wealthy++; excess += people[j];}
            }
            Arrays.sort(people); long deficit = 0;
            for (int j = popSize - wealthy - 1; j >= 0; j--) {
                long remains = excess + deficit;
                if (people[j] < (-1) * remains) { break; }
                deficit += people[j]; wealthy++;
            }
            System.out.println(wealthy);
        }
    }
}