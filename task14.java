import java.util.*;

public class Level1
{
    public static int Unmanned(int L, int N, int [][] track)
      {
        int sum = track[0][0];

        if(track[0][1] > sum) {
            sum = track[0][1];
        }

        for(int i = 1; i < N; i ++) {
            sum += track[i][0] - track[i - 1][0];

            if(sum % (track[i][1] + track[i][2]) <= track[i][1]) {
                sum += track[i][1] - sum % (track[i][1] + track[i][2]);
            }
        }
		
        sum += (L - track[N - 1][0]);

        return sum;
      }
}