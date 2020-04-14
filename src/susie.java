import java.util.*;
public class susie {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int numPeople = iangay.nextInt();
        int[] people = new int[numPeople];
        for (int i = 0; i < numPeople; i++) { people[i] = iangay.nextInt(); }
        Arrays.sort(people);
        int totalWait = 0; int dissatisfied = 0;
        for (int i = 0; i < numPeople; i++) {
            if (people[i] < totalWait) { dissatisfied++; }
            else { totalWait += people[i]; }
        }
        System.out.println(numPeople-dissatisfied);
    }
}
