import java.util.*;

public class Level1
{
    public static int ConquestCampaign(int N, int M, int L, int [] battalion) 
	{
        int[][] polygon = new int[N][M];
        int capturedSquare = 0;
        int day = 1;

        for(int land = 0; land < L; land ++) {
            if(polygon[battalion[2 * land] - 1 ][battalion[2 * land + 1] - 1] == 0) {
                polygon[battalion[2 * land] - 1][battalion[2 * land + 1] - 1] = 1;
                capturedSquare ++;
            }
        }

        while(capturedSquare != N * M) {
            for(int i = 0; i < N; i ++) {
                for(int j = 0; j < M; j ++) {
                    if(polygon[i][j] == day) {
                        if((j + 1) < M && polygon[i][j + 1] == 0) {
                            polygon[i][j + 1] = day + 1;
                            capturedSquare ++;
                        }
                        if((j - 1) >= 0 && polygon[i][j - 1] == 0) {
                            polygon[i][j - 1] = day + 1;
                            capturedSquare ++;
                        }
                        if((i + 1) < N && polygon[i + 1][j] == 0) {
                            polygon[i + 1][j] = day + 1;
                            capturedSquare ++;
                        }
                        if((i - 1) >= 0 && polygon[i - 1][j] == 0) {
                            polygon[i - 1][j] = day + 1;
                            capturedSquare ++;
                        }
                    }
                }
            }
            day ++;
        }
		
        return day;
    }
}