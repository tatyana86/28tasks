import java.util.*;

public class Level1
{
    public static char [][] OneTurnCircle(char [][] matrix, int M, int N, int circle) {
        char bufferPrev = matrix[circle][circle];
        for(int j = 1 + circle; j < N - circle; j ++) {
            char bufferFut = matrix[circle][j];
            matrix[circle][j] = bufferPrev;
            bufferPrev = bufferFut;
        }

        for(int i = 1 + circle; i < M - circle; i ++) {
            char bufferFut = matrix[i][N - 1 - circle];
            matrix[i][N - 1 - circle] = bufferPrev;
            bufferPrev = bufferFut;
        }

        for(int j = N - 2 - circle; j >= circle; j --) {
            char bufferFut = matrix[M - 1 - circle][j];
            matrix[M - 1 - circle][j] = bufferPrev;
            bufferPrev = bufferFut;
        }

        for(int i = M - 2 - circle; i >= circle; i --) {
            char bufferFut = matrix[i][circle];
            matrix[i][circle] = bufferPrev;
            bufferPrev = bufferFut;
        }

        return matrix;
    }

    public static void MatrixTurn(String Matrix[], int M, int N, int T) {
        char [][] matrix = new char [M][N];
        int minNum = M;
        if(N < minNum) {
            minNum = N;
        }
        int countCircle = minNum / 2;

        for(int i = 0; i < M; i ++) {
            for(int j = 0; j < N; j ++) {
                matrix[i][j] = Matrix[i].charAt(j);
            }
        }

        for(int turn = 0; turn < T; turn ++) {
            for (int circle = 0; circle < countCircle; circle++) {
                OneTurnCircle(matrix, M, N, circle);
            }
        }

        for(int i = 0; i < M; i ++) {
            Matrix[i] = new String(matrix[i]);
        }
    }
}