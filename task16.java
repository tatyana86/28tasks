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
                        list[j - 1]= y;
                    }
                }
            }
        }
    }

    public static int MaximumDiscount(int N, int [] price) {
        int sum = 0;
        sortArray(price);
        for(int i = N - 3; i > -1; i -= 3) {
            sum += price[i];
        }
        return sum;
    }
}