import java.util.*;

public class Level1
{
    public static boolean isSubstring(String s1, String s2) {
        for(int i = 0; (i + s2.length()) <= s1.length(); i ++) {
            int j = 0;
            for(j = 0; j < s2.length(); j ++) {
                if(s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
            }
            if(j == s2.length())
                return true;
        }
        return false;
    }

    public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2) {
        String[] map = S1.split(" ");
        String[] tanks = S2.split(" ");
        int entry = 0;

        for(String tank : tanks) {
            for(String line : map) {
                if(isSubstring(line, tank)) {
                    entry ++;
                    break;
                }
            }
        }

        if(entry == H2){
            return true;
        }

        return false;
    }
}