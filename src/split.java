import java.util.*;
import java.io.*;
public class split {
    private static long sort(int[] array, int l, int r) {
        if (l < r) {
//            System.out.println("Bad");
            int m = (l + r) / 2;
            long x = sort(array, l, m);
            long y = sort(array, m + 1, r);
            long z = merge(array, l, m, r);
            return x + y + z;
        }
        return 0;
    }
    private static long merge(int[] array, int l, int m, int r) {
        long x = 0;
        int n1 = m - l + 1, n2 = r - m;
//        System.out.println("n1: "+n1+" and n2: "+n2+" and l: "+l+" and m: "+m+" and r: "+r);
        int[] arr1 = new int[n1], arr2 = new int[n2];
        for (int i = 0; i < n1; ++i) { arr1[i] = array[l + i]; }
        for (int j = 0; j < n2; ++j) { arr2[j] = array[m + 1 + j]; }
        int i = 0, j = 0;
//        System.out.print("arr1: ");
//        for (int a : arr1) { System.out.print(a+" "); }
//        System.out.print("\narr2: ");
//        for (int a : arr2) { System.out.print(a+" "); }
//        System.out.println();
        int k = l;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) { array[k] = arr1[i]; i++; }
            else { array[k] = arr2[j]; j++; x += n1 - i; }
            k++;
//            System.out.println(array.length+" "+x+" "+i+" "+j);
        }
        while (i < n1) { array[k] = arr1[i]; i++; k++; }
        while (j < n2) { array[k] = arr2[j]; j++; k++; }
//        for (int a : array) { System.out.print(a+" "); }
//        System.out.println();
//        System.out.println(x);
        return x;
    }
    public static void main(String[] args) throws IOException {

        File file = new File("IntegerArray.txt");
        Scanner in = new Scanner(file);
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) { array[i] = in.nextInt(); }

//        int[] array = {1,3,5,2,4,6};
        System.out.println(sort(array, 0, array.length - 1));
//        for (int x : array) { System.out.print(x+" "); }
    }
}