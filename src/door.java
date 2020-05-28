import java.util.*;
public class door {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int numMounts = iangay.nextInt();
            int doorL = iangay.nextInt();
            int[] mounts = new int[numMounts];
            for (int j = 0; j < numMounts; j++) { mounts[j] = iangay.nextInt(); }

//            for (int x : mounts) { System.out.print(x+" "); }
//            System.out.println();

            int[] peaks = new int[numMounts];
            peaks[0] = 0;
            for (int j = 1; j < numMounts - 1; j++) {
                if (mounts[j] > mounts[j-1] && mounts[j] > mounts[j+1]) {
                    peaks[j] = peaks[j-1]+1;
                }
                else { peaks[j] = peaks[j-1]; }
            }
            peaks[numMounts-1] = peaks[numMounts-2];

//            for (int x : peaks) { System.out.print(x+" "); }
//            System.out.println();

            int[] segments = new int[numMounts-doorL+1];
            int max = Integer.MIN_VALUE; int maxPeaks = Integer.MIN_VALUE;
            for (int j = 0; j < segments.length; j++) {
                int numPeaks = peaks[j+doorL-2] - peaks[j];
                if (numPeaks > maxPeaks) {
                    maxPeaks = numPeaks;
                    max = j;
//                    System.out.println(maxPeaks);
                }
            }
            System.out.println((maxPeaks+1)+" "+(max+1));
        }
    }
}