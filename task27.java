import java.util.*;

public class Level1
{
    public static boolean isSort(int F[]) {
        for(int i = 0; i < F.length - 1; i ++) {
            if(F[i] > F[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean rule1(int F[], int index1, int index2) {
        int A [] = new int[F.length];
        System.arraycopy(F, 0, A, 0, F.length);
        A[index1] = F[index2];
        A[index2] = F[index1];
        return isSort(A);
    }

    public static boolean rule2(int F[], int index1, int index2) {
        int A [] = new int[F.length];
        System.arraycopy(F, 0, A, 0, F.length);
        int count = 0;
        for(int i = 0; i < A.length; i ++) {
            if(i >= index1 && i <= index2 && count <= (index2 - index1) / 2) {
                A[i] = F[index2 - count];
                A[index2 - count] = F[i];
                count ++;
            }
        }
        return isSort(A);
    }

    public static boolean Football(int F[], int N) {
        if(isSort(F)) {
            return false;
        }

        int index1 = -1;
        int index2 = -1;

        for(int i = 0; i < N - 1; i ++) {
            if(F[i] > F[i + 1]) {
                index1 = i;
                break;
            }
        }

        for(int i = N - 1; i > index1; i --) {
            if(F[i] < F[i - 1]) {
                index2 = i;
                break;
            }
        }

        return rule1(F, index1, index2) || rule2(F, index1, index2);
    }
}