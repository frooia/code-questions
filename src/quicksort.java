import java.util.*;
import java.io.*;
public class quicksort {
    private static int comparisons = 0;
    private static int median(int[] array, int l, int r) {
        int m = (l + r) / 2;
        if ((array[m] <= array[l] && array[m] >= array[r]) ||
                (array[m] >= array[l] && array[m] <= array[r])) { return m; }
        if ((array[l] <= array[m] && array[l] >= array[r]) ||
                (array[l] >= array[m] && array[l] <= array[r])) { return l; }
        else { return r; }
    }
    private static int partition(int[] array, int l, int r) {
        int p = median(array, l, r);
        int s = array[p];
        array[p] = array[l];
        array[l] = s;
        int i = l + 1, j = l + 1;
        while (i <= j && j <= r) {
//            System.out.println(i+" "+j);
            if (array[j] < array[l]) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i++;
            }
            j++;
        }
        comparisons += r - l;
//        System.out.println(array[i - 1]);
        s = array[l];
        array[l] = array[i - 1];
        array[i - 1] = s;
//        for (int a : array) { System.out.print(a+" "); }
//        System.out.println();
        return i - 1;
    }
    private static void sort(int[] array, int l, int r) {
        if (l < r) {
//            System.out.println("One: "+l+" to "+r);
            int p = partition(array, l, r);
            sort(array, l, p - 1);
            sort(array, p + 1, r);
        }
    }
    public static void main(String[] args) throws IOException {

        File file = new File("QuickSort.txt");
        Scanner in = new Scanner(file);
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) { array[i] = in.nextInt(); }

//        int[] array = {4,1,6,5,2,3};
        sort(array, 0, array.length - 1);
        for (int a : array) { System.out.print(a+" "); }
        System.out.println();
        System.out.println(comparisons);
    }
}
