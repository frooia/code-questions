import java.util.*;
import java.io.*;
public class dvd {
    private static int xPos = 0, yPos = 0, dirS = 0;
    private static boolean hitCorner(int x, int y, int dw, int dh, int sw, int sh) {
        return (x == 0 && y == 0) || (x == 0 && y == sh - dh) || (x == sw - dw && y == 0) || (x == sw - dw && y == sh - dh);
    }
    private static int hitWall(int x, int y, int dw, int dh, int sw, int sh) {
        if (x <= 0) {
            return 1;
        } else if (x >= sw - dw) {
            return 3;
        } else if (y <= 0) {
            return 2;
        } else if (y >= sh - dh) {
            return 4;
        } return 0;
    }
    private static void move(int x, int y, int dir) {
        if (dir == 1) {
            xPos = x + 1; yPos = y + 1;
        } else if (dir == 2) {
            xPos = x + 1; yPos = y - 1;
        } else if (dir == 3) {
            xPos = x - 1; yPos = y - 1;
        } else if (dir == 4) {
            xPos = x - 1; yPos = y + 1;
        }
    }
    private static void turn(int dir, int wall) {
        if (wall == 1) {
            if (dir == 3) dirS = 2;
            else if (dir == 4) dirS = 1;
        } else if (wall == 2) {
            if (dir == 2) dirS = 1;
            else if (dir == 3) dirS = 4;
        } else if (wall == 3) {
            if (dir == 1) dirS = 4;
            else if (dir == 2) dirS = 3;
        } else if (wall == 4) {
            if (dir == 1) dirS = 2;
            else if (dir == 4) dirS = 3;
        }
    }
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int dw = fs.nextInt(), dh = fs.nextInt(), sw = fs.nextInt(), sh = fs.nextInt();
            int dir = 1; // 1 for down-right, 2 for up-right, 3 for up-left, 4 for down-left
            int x = 1, y = 1;
            long path = 1;
            int count = 0;
            //while (count < 100) {
            while (!hitCorner(x, y, dw, dh, sw, sh)) {
                //out.println(x + " " + y);
                //out.println(dir);
                int wall = hitWall(x, y, dw, dh, sw, sh);
                /*
                if (x == 0) {
                    wall = 1;
                } else if (x == sw - dw) {
                    wall = 3;
                } else if (y == 0) {
                    wall = 2;
                } else if (y == sh - dh) {
                    wall = 4;
                } else wall = 0; */
                if (wall != 0) {
                    //out.println("Hit wall " + wall);
                    turn(dir, wall);
                    dir = dirS;
                    /*
                    if (wall == 1) {
                        if (dir == 3) dir = 4;
                        else if (dir == 4) dir = 3;
                    } else if (wall == 2) {
                        if (dir == 2) dir = 3;
                        else if (dir == 3) dir = 2;
                    } else if (wall == 3) {
                        if (dir == 1) dir = 2;
                        else if (dir == 2) dir = 1;
                    } else if (wall == 4) {
                        if (dir == 1) dir = 4;
                        else if (dir == 4) dir = 1;
                    } */
                }
                /*
                if (dir == 1) {
                    x = x + 1; y = y + 1;
                } else if (dir == 2) {
                    x = x + 1; y = y - 1;
                } else if (dir == 3) {
                    x = x - 1; y = y - 1;
                } else if (dir == 4) {
                    x = x - 1; y = y + 1;
                } */
                move(x, y, dir);
                x = xPos; y = yPos;
                path++;
                count++;
            }
            out.println(path);
        }
        out.close();
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        FastScanner(InputStream i) { br = new BufferedReader(new InputStreamReader(i)); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}