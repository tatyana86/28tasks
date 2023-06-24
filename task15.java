import java.util.*;

public class Level1
{
    public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2) {
        String[] map = S1.split(" ");
        String[] tanks = S2.split(" ");

        for(int i = 0; i <= (H1 - H2); i ++) {
            int index = map[i].indexOf(tanks[0]);
            while(index > -1) {
                int entry = 1;
                for(int j = 1; j < H2; j ++) {
                    if(map[i + j].indexOf(tanks[j], index) != index) {
                        index = map[i].indexOf(tanks[0], index + 1);
                        break;
                    }
                    entry ++;
                }
                if(entry == H2){
                    return true;
                }
            }
        }
        return false;
    }
}