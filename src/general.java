import java.util.*;
public class general {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int n = iangay.nextInt();
        int[] heights = new int[n];
        int min = 0; int max = 0;
        for (int i = 0; i < n; i++) {
            heights[i] = iangay.nextInt();
            if (heights[i] <= heights[min]) { min = i; }
            if (heights[i] > heights[max]) { max = i; }
        }
        if (min < max) { System.out.println(max + n - min - 2); }
        else { System.out.println(max + n - min - 1); }
    }
}