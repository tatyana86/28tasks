import java.util.*;

public class Level1
{
    public static String MassVote(int N, int [] Votes)
      {
        int max = 0;
        int maxInd = 0;
        int count = 0;
        int sum = 0;

        for(int i = 0; i < N; i ++) {
            if(i == 0) {
                max = Votes[i];
                maxInd = i;
            }
            if(Votes[i] > max) {
                max = Votes[i];
                maxInd = i;
                count = 0;
            }
            if(Votes[i] == max) {
                count ++;
            }
            sum += Votes[i];
        }

        if(count > 1) {
            return "no winner";
        }

        if(1.0 * max / sum > 0.5) {
            return "majority winner " + (maxInd + 1);
        }

        return "minority winner " + (maxInd + 1);
      }
}