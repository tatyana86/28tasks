import java.util.*;

public class Level1
{
    public static boolean isSubstring(String s1, String s2) {
        for(int i = 0; (i + s2.length()) <= s1.length(); i ++) {
            int j = 0;
            for(j = 0; j < s2.length(); j ++) {
                if(s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
            }
            String p = " ";
            if(j == s2.length() && ( (i + j) == s1.length() || s1.charAt(i + j) == p.charAt(0)) && (i == 0 || s1.charAt(i - 1) == p.charAt(0)) )
                return true;
        }
        return false;
    }

    public static int [] WordSearch(int len, String s, String subs) {
        String [] words = s.split(" ");
        String cur = "";
        ArrayList<String> alignWords = new ArrayList<String>();

        for(int i = 0; i < words.length; i ++) {
            if(words[i].length() > len) {
                char [] charWord = words[i].toCharArray();
                if(cur.length() != 0) {
                    alignWords.add(cur);
                }
                for(int w = 0; w < charWord.length / len; w ++) {
                    char [] curWord = new char[len];
                    for(int j = 0; j < len; j ++) {
                        curWord[j] = charWord[j + len * w];
                    }
                    cur = new String(curWord);
                    alignWords.add(cur);
                    cur = "";
                }
                if(charWord.length % len != 0) {
                    char [] curWord = new char[charWord.length % len];
                    for(int k = 0; k < charWord.length % len; k ++) {
                        curWord[k] = charWord[charWord.length / len * len + k];
                    }
                    cur = new String(curWord);
                }
            } else
            if(cur.length() == 0 && words[i].length() <= len) {
                cur = words[i];
            } else
            if(cur.length() > 0 && cur.length() + 1 + words[i].length() <= len) {
                cur = cur + " " + words[i];
            }
            else {
                alignWords.add(cur);
                cur = words[i];
            }
        }
        if(cur.length() != 0) {
            alignWords.add(cur);
        }

        int [] result = new int[alignWords.size()];

        for(int i = 0; i < alignWords.size(); i++) {
            if(isSubstring(alignWords.get(i), subs)) {
                result[i] = 1;
            }
            else {
                result[i] = 0;
            }
        }

        return result;
    }
}