import java.util.*;
public class simplestrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> initString = new ArrayList<>(Arrays.asList(in.next().split("")));
        ArrayList<Integer> olist = new ArrayList<>();
        ArrayList<Integer> clist = new ArrayList<>();
        for (int i = 0; i < initString.size(); i++) {
            if (initString.get(i).equals("(")) { olist.add(i); }
            else { clist.add(i); }
        }
        int o = 0; int c = clist.size()-1;
        ArrayList<Integer> removedIndices = new ArrayList<>();
        while (o < olist.size() && c >= 0 && olist.get(o) < clist.get(c)) {
            removedIndices.add(olist.get(o)); removedIndices.add(clist.get(c));
            o++; c--;
        }
        Collections.sort(removedIndices);
        if (!removedIndices.isEmpty()) {
            System.out.println(1+"\n"+removedIndices.size());
            for (int j : removedIndices) { System.out.print(j+1+" "); }
        }
        else { System.out.println(0); }
    }
}
