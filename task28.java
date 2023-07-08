import java.util.*;

public class Level1
{
    public static int rev(int a) {
        if(a == 0) {
            return 1;
        }
        return 0;
    }

    public static String Keymaker(int k) {
        int [] keys = new int[k];
        String res = "";

        for(int i = 1; i <= k; i ++) {
            for(int j = 0; j < k; j ++) {
                if(i == 1) {
                    keys[j] = i;
                    continue;
                }
                if((j + 1) % i == 0) {
                    keys[j] = rev(keys[j]);
                }
            }
        }

        for(int j = 0; j < k; j ++) {
                res += keys[j];
        }

        return res;
    }
}