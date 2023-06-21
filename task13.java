import java.util.*;

public class Level1
{
    public static int [] UFO(int N, int [] data, boolean octal) {
        int numDig;
        int d;
        int res;
        int numSyst = 8;
        if(! octal) {
            numSyst = 16;
        }

        for(int i = 0; i < N; i ++) {
            res = 0;
            numDig = 0;
            while(data[i] > 0) {
                d = data[i] % 10;
                res += d * Math.pow(numSyst, numDig);
                numDig ++;
                data[i] = data[i] / 10;
            }
            data[i] = res;
        }

        return data;
    }
}