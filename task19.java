import java.util.*;

public class Level1
{
    public static String[] ShopOLAP(int N, String [] items) {
        ArrayList<String> name =  new ArrayList<String>();
        ArrayList<Integer> amount =  new ArrayList<Integer>();

        for(int i = 0; i < N; i ++ ){
            String[] pairs = items[i].split(" ");

            int amountCurrent = Integer.valueOf(pairs[1]);

            if(i == 0) {
                name.add(pairs[0]);
                amount.add(amountCurrent);
                continue;
            }

            boolean isRepeat = false;
            for(int j = 0; j < i; j ++) {
                if(name.size() > j && pairs[0].equals(name.get(j))) {
                    isRepeat = true;
                    amountCurrent = amount.get(j) + Integer.valueOf(pairs[1]);
                    amount.set(j, amountCurrent);
                    break;
                }
            }

            if(! isRepeat) {
                amount.add(amountCurrent);
                name.add(pairs[0]);
            }
        }

        String [] nameArray = name.toArray(new String[name.size()]);
        int [] amountArray = new int [amount.size()];
        for(int i = 0; i < amountArray.length; i++) {
            amountArray[i] = amount.get(i);
        }

        for(int i = 0; i < amountArray.length - 1; ++i) {
            for(int j = 0; j < amountArray.length - i - 1; ++j) {
                if(amountArray[j + 1] > amountArray[j] || (amountArray[j + 1] == amountArray[j] && nameArray[j + 1].compareTo(nameArray[j]) < 0)) {
                    int buf1 = amountArray[j];
                    amountArray[j] = amountArray[j + 1];
                    amountArray[j + 1] = buf1;

                    String buf2 = nameArray[j];
                    nameArray[j] = nameArray[j + 1];
                    nameArray[j + 1] = buf2;
                }
            }
        }

        String [] result = new String[nameArray.length];

        for(int i = 0; i < nameArray.length; i ++) {
            result[i] = nameArray[i] + " " + amountArray[i];
        }

        return result;
      }
}