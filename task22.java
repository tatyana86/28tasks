import java.util.*;

public class Level1
{
    public static boolean SherlockValidString(String s) {
        int count = 1;
        ArrayList<Integer> countOfSymb = new ArrayList<>();
        char [] ar = s.toCharArray();
        Arrays.sort(ar);
        for(int i = 1; i < ar.length; i ++) {
            if(ar[i] == ar[i - 1]) {
                count ++;
                continue;
            }
            countOfSymb.add(count);
            count = 1;
        }
        countOfSymb.add(count);

        int countDel = 0;
        for(int i = 1; i < countOfSymb.size(); i ++) {
            if(countOfSymb.get(i) == countOfSymb.get(i - 1)) {
                continue;
            }
            if((countOfSymb.get(i) - 1 == countOfSymb.get(i - 1) || countOfSymb.get(i) == countOfSymb.get(i - 1) - 1) && countDel == 0) {
                countDel ++;
                continue;
            }
            return false;
        }

        return true;
    }
}