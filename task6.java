import java.util.*;

public class Level1
{
    public static String PatternUnlock(int N, int [] hits) {
        double length = 0.0;
		String result = "";

        for(int i = 1; i < N; i ++) {
            int checkDif = Math.abs(hits[i - 1] - hits[i]);
            int checkSum = hits[i - 1] + hits[i];
            if(checkDif == 1 || checkSum == 7 || checkSum == 10) {
                length += 1;
            }
            else {
                length += Math. sqrt(2);
            }
        }

        String roundLength = String.format("%.5f", length);
        char [] arrayRoundLength = roundLength.toCharArray();

        for(int i = 0; i < arrayRoundLength.length; i ++) {
            if(arrayRoundLength[i] != '0' && arrayRoundLength[i] != ',') {
                result += arrayRoundLength[i];
            }
        }

        return result;
    }
}