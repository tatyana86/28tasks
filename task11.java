import java.util.*;

public class Level1
{
    public static String BigMinus(String s1, String s2) {
        String dif = "";
		int debt = 0;

        if(s1.length() < s2.length()) {
            String sBuf = s1;
            s1 = s2;
            s2 = sBuf;
        }

        int difLen = s1.length() - s2.length();

        if(difLen == 0) {
            for(int i = 0; i < s1.length(); i ++) {
                if((int) s1.charAt(i) < (int) s2.charAt(i)) {
                    String sBuf = s1;
                    s1 = s2;
                    s2 = sBuf;
                    break;
                }
            }
        }

        for(int i = 0; i < difLen; i ++) {
            s2 = "0" + s2;
        }

        for(int i = s1.length() - 1; i > -1; i --) {
            int curDig = (int) s1.charAt(i) - debt;
            boolean lessNull = curDig < (int) s2.charAt(i);
            if (lessNull) {
                dif = 10 + curDig - (int) s2.charAt(i) + dif;
                debt = 1;
            }
            if(! lessNull) {
                dif = curDig - (int) s2.charAt(i) + dif;
                debt = 0;
            }
        }

        if(dif.charAt(0) == '0') {
            String difWithoutNull = "";
            for(int i = 1; i < dif.length(); i ++) {
                char cur = dif.charAt(i);
                if(cur == '0' && difWithoutNull.length() == 0) {
                    continue;
                }
                difWithoutNull += cur;
            }
            return difWithoutNull;
        }

        return dif;
    }
}