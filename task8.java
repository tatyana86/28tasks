import java.util.*;

public class Level1
{
    public static int SumOfThe(int N, int [] data) {
        int sumSupport = 0;
        int sumReal = data[0];

        for(int i = 0; i < data.length; i ++) {
            sumSupport += data[i];
        }

        for(int i = 0; i < data.length; i ++) {
            if(data[i] * 2 == sumSupport) {
                sumReal = data[i];
                break;
            }
        }

        return sumReal;
    }
}