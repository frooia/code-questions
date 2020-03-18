import java.util.ArrayList;
import java.util.HashMap;

public class CropBlight {
    static int [] [] M;
    static int [] nr = {1,0}; //neighbor coordinates
    static int [] nc = {0,1};
    public CropBlight(int [] [] map) {
        M = map;
    }
    public boolean hasAdj(int i, int j) {
        return M[i][j] == M[i + 1][j] || M[i][j] == M[j + 1][i];
    }
    public HashMap dfs(int i, int j) {
        HashMap similarNodes = new HashMap<Integer, Integer>();
        similarNodes.put(i,j);
        for (int k = 0; k < nr.length; k++) {
            if (M[i+nr[k]][j+nc[k]] == M[j][j]) {
                similarNodes.putAll(dfs(i+nr[k], j+nc[k]));
            }
        }
        return similarNodes;
    }
}
