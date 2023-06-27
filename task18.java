import java.util.*;

public class Level1
{
	public static int findIndex(int num, int[] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static boolean MisterRobot(int N, int[] data) {
        for (int i = 1; i <= data.length; i++) {
            int indexNum = findIndex(i, data);
            int indexMove = indexNum - i + 1;

            if (indexMove == 1 && indexNum == data.length - 1) {
                return false;
            }

            if (indexMove <= 0) {
                continue;
            }

            while (indexMove != 0) {

                if (indexMove >= 2) {
                    int buffer = data[indexNum - 2];
                    data[indexNum - 2] = data[indexNum];
                    data[indexNum] = data[indexNum - 1];
                    data[indexNum - 1] = buffer;
                }

                if (indexMove == 1) {
                    int buffer = data[indexNum - 1];
                    data[indexNum - 1] = data[indexNum];
                    data[indexNum] = data[indexNum + 1];
                    data[indexNum + 1] = buffer;
                }

                indexNum = findIndex(i, data);
                indexMove = indexNum - i + 1;
            }
        }
        return true;
    }
}