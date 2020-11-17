import java.util.*;
class compcampstudent {
    String name;
    int score;
    compcampstudent(String n, int s) {
        name = n;
        score = s;
    }
    int compareTo(compcampstudent other) {
        if (this.score != other.score)
            return other.score - this.score;
        return this.name.compareTo(other.name);
    }
}
public class rating {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        while (tc --> 0) {
            int n = in.nextInt();
            TreeSet<compcampstudent> tmap = new TreeSet<>(compcampstudent::compareTo);
            for (int i = 0; i < n; i++) {
                String name = in.next();
                int score = in.nextInt() + in.nextInt() + in.nextInt() + in.nextInt() + in.nextInt() + in.nextInt() + 200 * in.nextInt();
                tmap.add(new compcampstudent(name, score));
            }
            for (compcampstudent s : tmap) {
                System.out.println(s.name);
            }
        }
    }
}