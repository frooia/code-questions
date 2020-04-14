import java.util.*;
public class eugene {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int length = iangay.nextInt();
        int[] array = new int[length];
        long numGood = 0; int left = -1; int right = 0; long sum = 0;
        for (int j = 0; j < length; j++) {
            array[j] = iangay.nextInt();
            sum += array[j];
            if (array[j] == 0) { left = right; right = j; }
            else if (sum == 0) { sum -= array[left]; left = right; right = j; numGood += j - left; }
            else { numGood += j - left; }
            System.out.println(left+" "+right+" "+sum+" "+numGood);
        }
        System.out.println(numGood);
    }
}