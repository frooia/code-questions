import java.util.*;
public class cards {
    static int lowerBound(long[] a, int low, int high, long element) {
        while (low < high) {
            int middle = low + (high - low) / 2;
            if (element == a[middle]) {
                return middle;
            } else if (element > a[middle]) {
                low = middle + 1;
            } else {
                high = middle;
            }
        }
        return low-1;
    }
    public static <T> List<T> convertAtoL(T array[]) {
        return Arrays.asList(array);
    }
    public static int maxPyramids(long[] cardCounts, long n) {
        if (n < 2) { return 0; }
        int lowerbound = lowerBound(cardCounts, 0, cardCounts.length, n);
//        System.out.println(lowerbound+": "+cardCounts[lowerbound]);
        return 1 + maxPyramids(cardCounts, n-cardCounts[lowerbound]);
    }
    public static void main(String[] args) {
        long[] cardCounts = new long[25820];
        for (int i = 0; i < cardCounts.length; i++) {
            cardCounts[i] = (3 * i * (i - 1) / 2 + 2 * i);
        }
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            long n = iangay.nextLong();
            System.out.println(maxPyramids(cardCounts, n));
        }
//        long[] a = {1, 3, 4, 6, 10, 11, 34};
//        System.out.println(lowerBound(a, 0, a.length, 11));
//        System.out.println(lowerBound(a, 0, a.length, 12));
    }
}