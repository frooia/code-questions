/*
ID: frooia71
LANG: JAVA
TASK: ride
*/
import java.io.*;

class ride {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("ride.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
        char[] comet = f.readLine().toCharArray();
        char[] group = f.readLine().toCharArray();
        int cscore = 1; int gscore = 1;
        for (char c : comet) {
            cscore *= c % 64;
        }
        for (char g : group) {
            gscore *= g % 64;
        }
        if (cscore%47==gscore%47) {
            out.println("GO");
        }
        else {
            out.println("STAY");
        }
        out.close();
    }
}