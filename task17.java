import java.util.*;

public class Level1
{
    public static boolean LineAnalysis(String line) {
        String[] symbols = line.split("\\*");

        for(int i = 1; i < symbols.length - 1; i ++) {
            if(! symbols[i].equals(symbols[i + 1])) {
                return false;
            }
        }

        return true;
    }
}