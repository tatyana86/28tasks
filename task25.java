import java.util.*;

public class Level1
{
    static ArrayList<Integer> B = new ArrayList<>();

    public static int FindMaxNum(ArrayList<Integer> array, int j, int k) {
        int maxNum = array.get(j);
        for(int i = j + 1; i <= k; i ++) {
            if(array.get(i) > maxNum) {
                maxNum = array.get(i);
            }
        }
        return maxNum;
    }

    public static void Transform(ArrayList<Integer> array) {

        ArrayList<Integer> arrayClone = (ArrayList<Integer>) array.clone();
        B.clear();

        for(int i = 0; i < arrayClone.size(); i ++) {
            for(int j = 0; j < arrayClone.size() - i; j ++) {
                int k = i + j;
                B.add(FindMaxNum(arrayClone, j, k));
            }
        }

    }

    public static boolean TransformTransform(int A[], int N) {
        int sum = 0;
        ArrayList<Integer> newA = new ArrayList<>();
        for(int i = 0; i < N; i ++) {
            newA.add(A[i]);
        }

        Transform(newA);
        Transform(B);

        for(int i = 0; i < B.size(); i ++) {
            sum += B.get(i);
        }

        if(sum % 2 == 0) {
            return true;
        }

        return false;
    }
}