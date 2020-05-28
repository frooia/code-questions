import java.util.*;
public class messages {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int n = iangay.nextInt();
        int k = iangay.nextInt();
        LinkedList<Integer> convos = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int x = iangay.nextInt();
            if (convos.contains(x)) { continue; }
            convos.push(x);
            if (convos.size() > k) { convos.removeLast(); }
//            for (int c : convos) { System.out.print(c+" "); }
//            System.out.println();
        }
        System.out.println(convos.size());
        for (int c : convos) { System.out.print(c+" "); }
    }
}