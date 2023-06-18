import java.util.*;

public class Level1
{
    public static String withoutSpace(String s) {
        char [] text = s.toCharArray();
        String sWithoutSpace = "";

        for(int i = 0; i < text.length; i ++) {
            if(text[i] != ' ') {
                sWithoutSpace += Character.toString(text[i]);
            }
        }

        return sWithoutSpace;
    }

    public static String TheRabbitsFoot(String s, boolean encode) {
        String sWithoutSpace = withoutSpace(s);
        String sResult = "";
        int N = sWithoutSpace.length();
        double sqrtLen = Math. sqrt(N);
        int row = (int) Math.floor(sqrtLen);
        int col = (int) Math.ceil(sqrtLen);

        if(row * col < N) {
            row ++;
        }

        char [][] pack = new char[row][col];

        if(encode) {
			
            for(int i = 0; i < row; i ++) {
                for(int j = 0; j < col; j ++) {
                    if(i * row + j < N) {
                        pack[i][j] = sWithoutSpace.charAt(i * row + j);
                    }
                }
            }

            for (int j = 0; j < col; j++) {
                for (int i = 0; i < row; i++) {
                    if(i * row + j < N) {
                        sResult += Character.toString(pack[i][j]);
                    }
                }
                if(j != col - 1) {
                    sResult += " ";
                }
            }

            return sResult;
			
        }

        int sp = 0;
        for(int j = 0; j < col; j ++) {
            int i;
            for(i = 0; i < row; i ++) {
                if(j * col + i + sp < s.length()) {
                    pack[i][j] = s.charAt(j * col + i + sp);
                }
            }
            if(j * col + i + sp < s.length() && s.charAt(j * col + i + sp) == ' ') {
                sp ++;
            }
        }

        for(int i = 0; i < row; i ++) {
            for (int j = 0; j < col; j++) {
                if(i * row + j < N) {
                    sResult += Character.toString(pack[i][j]);
                }
            }
        }

        return sResult;
    }
}