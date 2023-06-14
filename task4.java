import java.util.*;

public class Level1 {
	
	public static void sortArray(int [] list) {
        int x, y;
        for(int i = 0; i < (list.length - 1); i ++) {
            if(list[i + 1] < list[i]) {
                x = list[i];
                list[i] = list[i + 1];
                list[i + 1] = x;
                for(int j = i; j > 0; j --) {
                    if(list[j] < list[j - 1]) {
                        y = list[j];
                        list[j] = list[j - 1];
                        list[j - 1]= y;
                    }
                }
            }
        }
    }
	
    public static int [] MadMax(int N, int [] Tele) {
        int [] arrayImpulse = new int[N];
		int k = 0;

        sortArray(Tele);     

        for(int i = 0; i < N; i ++) {
            if(i < N / 2) {
                arrayImpulse[i] = Tele[i];
            } else
			if (i == N / 2) {
                arrayImpulse[i] = Tele[N - 1];
            } else {
                arrayImpulse[i] = Tele[N - 2 - k];
                k ++;
            }
        }

        return arrayImpulse;
    }
}