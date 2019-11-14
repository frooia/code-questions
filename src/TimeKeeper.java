import java.util.*;
public class TimeKeeper
{
    public static void main(String [ ] args)
    {
        Scanner iangay = new Scanner(System.in);
        int numCases = iangay.nextInt();
        for (int i = 0; i < numCases; i++) {
            String time = iangay.next() + iangay.nextLine();
            int hour = Integer.parseInt(time.substring(0, 2)) % 12;
            if (time.substring(6).equals("pm")) {
                hour += 12;
            }
            System.out.println(String.format("%02d", hour) + time.substring(3,5));
        }
    }
}
