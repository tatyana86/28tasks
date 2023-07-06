import java.util.*;

public class Level1
{
    public  static boolean white_walkers(String village) {
        int countWalker = 0;
        boolean isWalker = false;
        for (int i = 0; i < village.length() - 2; i++) {
            char elem1 = village.charAt(i);
            if(! Character.isDigit(elem1)) {
                countWalker = 0;
                continue;
            }
            for(int j = i + 1; j < village.length(); j ++) {
                char elem2 = village.charAt(j);
                if(elem2 == '=') {
                    countWalker ++;
                    continue;
                }
                if(Character.getNumericValue(elem1) + Character.getNumericValue(elem2) == 10 && countWalker != 3) {
                    return false;
                }
                if(Character.getNumericValue(elem1) + Character.getNumericValue(elem2) == 10 && countWalker == 3) {
                    isWalker = true;
                    break;
                }
            }
        }
        if(isWalker) {
            return true;
        }
        return false;
    }
}