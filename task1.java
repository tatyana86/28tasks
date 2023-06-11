import java.util.*;

public class Level1
{
    public static int squirrel(int N)
      {
        int f = 1;

        for(int i = 2; i <= N; i ++) {
            f *= i;
        }

        while(f > 9) {
            f /= 10;
        }

        return f;
      }
}