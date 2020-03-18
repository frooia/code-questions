import java.util.*;
public class vanya {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numLanterns = in.nextInt();
        int street = in.nextInt();
        TreeSet<Integer> lanterns = new TreeSet<>();
        for (int i = 0; i < numLanterns; i++) { lanterns.add(in.nextInt()); }
        int diameter = 0;
        Iterator<Integer> value = lanterns.iterator();
        int first = -1; int second = value.next();
        while (value.hasNext()) {
            first = second; second = value.next();
            int newD = Math.abs(second - first);
            if (newD > diameter) { diameter = newD; }
        }
        double radius = diameter / 2.0;
        if (lanterns.first() > radius) { radius = lanterns.first(); }
        if (street - lanterns.last() > radius) { radius = street - lanterns.last(); }
        System.out.println(radius);
    }
}
