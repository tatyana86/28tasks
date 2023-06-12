import java.util.*;

public class Level1
{
    public static int odometer(int [] oksana)
      {
        int dist = 0;
        int lastTime = 0;

        for(int i = 1; i < oksana.length; i += 2) {
            dist += (oksana[i] - lastTime) * oksana[i - 1];
            lastTime = oksana[i];
        }

        return dist;
      }
}