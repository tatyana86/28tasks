import java.util.*;

public class Level1
{
    public static int[][] growUpTree(int H, int W, int [][] tree) {
        for(int i = 0; i < H; i ++) {
            for (int j = 0; j < W; j++) {
                tree[i][j] ++;
            }
        }
        return tree;
    }

    public static int[][] dieTree(int H, int W, int [][] tree) {
        for(int i = 0; i < H; i ++) {
            for (int j = 0; j < W; j++) {
                if(tree[i][j] < 3) {
                    continue;
                }
                tree[i][j] = 0;
                if(i - 1 >= 0) {
                    tree[i - 1][j] = 0;
                }
                if(i + 1 < H) {
                    tree[i + 1][j] = 0;
                }
                if(j - 1 >= 0) {
                    tree[i][j - 1] = 0;
                }
                if(j + 1 < W) {
                    tree[i][j + 1] = 0;
                }
            }
        }
        return tree;
    }

    public static String [] TreeOfLife(int H, int W, int N, String [] tree) {
        String [] grownTree = new String [H];
        int [][] treeStruct = new int[H][W];
        int year = 1;

        for(int i = 0; i < H; i ++) {
            for(int j = 0; j < W; j ++) {
                if(tree[i].charAt(j) == '.') {
                    treeStruct[i][j] = 0;
                    continue;
                }
                treeStruct[i][j] = 1;
            }
        }

        while(year <= N) {
            growUpTree(H, W, treeStruct);
            if(year % 2 == 0) {
                dieTree(H, W, treeStruct);
            }
            year ++;
        }

        for(int i = 0; i < H; i ++) {
            String s = "";
            for (int j = 0; j < W; j++) {
                if(treeStruct[i][j] == 0) {
                    s += ".";
                    continue;
                }
                s += "+";
            }
            grownTree[i] = s;
        }

        return grownTree;
    }
}