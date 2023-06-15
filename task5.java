import java.util.*;

public class Level1
{
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
                        list[j - 1] = y;
                    }
                }
            }
        }
    }

    public static int [] copyArray(int [] list) {
        int [] list_copy = new int[list.length];
        for(int i = 0; i < list.length; i ++) {
            list_copy[i] = list[i];
        }
        return list_copy;
    }

    public static int [] SynchronizingTables(int N, int [] ids, int [] salary) {
        int [] idsCopy = copyArray(ids);
        int [] reordSalary = new int[N];

        sortArray(ids);
        sortArray(salary);

        for(int i = 0; i < N; i ++) {
            for(int j = 0; j < N; j ++) {
                if(idsCopy[i] == ids[j]) {
                    reordSalary[i] = salary[j];
                    break;
                }
            }
        }
        return reordSalary;
    }
}