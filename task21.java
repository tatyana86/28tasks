import java.util.*;

public class Level1
{
    public static String createString(int [] codeOfSymb) {
        String s = "";
        for(int i = 0; i < codeOfSymb.length; i ++) {
            s += (char) codeOfSymb[i];
        }
        return s;
    }

    public static String BiggerGreater(String input) {
        int [] codeOfSymb = new int [input.length()];

        for(int i = 0; i < input.length(); i ++) {
            codeOfSymb[i] = (int) input.charAt(i);
        }

        if(codeOfSymb[input.length() - 2] < codeOfSymb[input.length() - 1]) {
            int buffer = codeOfSymb[input.length() - 1];
            codeOfSymb[input.length() - 1] = codeOfSymb[input.length() - 2];
            codeOfSymb[input.length() - 2] = buffer;
            return createString(codeOfSymb);
        }

        int firstCode = codeOfSymb[0];
        int [] result = new int[input.length()];
        Arrays.sort(codeOfSymb);

        int firstIndex = -1;
        for(int i = 0; i < input.length(); i ++) {
            if(codeOfSymb[i] == firstCode) {
                firstIndex = i;
                break;
            }
        }

        if(firstCode == codeOfSymb[input.length() - 1]){
            return "";
        }

        for(int i = 1; i <= firstIndex; i ++) {
            codeOfSymb[i] = codeOfSymb[i - 1];
        }
        codeOfSymb[0] = codeOfSymb[firstIndex + 1];
        codeOfSymb[firstIndex + 1] = firstCode;

        return createString(codeOfSymb);
    }
}