import java.util.*;

public class Level1
{
    static ArrayList<String> result = new ArrayList<>();
    static {
        result.add("");
    }
    static int undoCount = 0;

    public static String createString(int N, char[] s) {
        String newResult = "";
        for(int i = 0; i < N; i ++) {
            newResult += Character.toString(s[i]);
        }
        return  newResult;
    }

    public static String BastShoe(String command) {

        String[] commandSeparation = command.split(" ",2);
        int commandNum = Integer.valueOf(commandSeparation[0]);

        if(commandNum == 1) {
            if(undoCount != 0) {
                String startResult = result.get(result.size() - 1 - undoCount);
                result.clear();
                result.add(startResult);
                undoCount = 0;
            }
            String commandArg = commandSeparation[1];
            String newResult = result.get(result.size() - 1) + commandArg;
            result.add(newResult);
        }

        if(commandNum == 2) {
            if(undoCount != 0) {
                String startResult = result.get(result.size() - 1 - undoCount);
                result.clear();
                result.add(startResult);
                undoCount = 0;
            }
            int commandArg = Integer.valueOf(commandSeparation[1]);
            String newResult = "";
            char [] lastResult = result.get(result.size() - 1).toCharArray();
            newResult = createString(lastResult.length - commandArg, lastResult);
            result.add(newResult);
        }

        if(commandNum == 3) {
            int commandArg = Integer.valueOf(commandSeparation[1]);
            String lastResult = result.get(result.size() - 1);
            String iResult = "";
            if(commandArg < lastResult.length()) {
                iResult = Character.toString(lastResult.charAt(commandArg));
            }
            return iResult;
        }

        if(commandNum == 4) {
            undoCount += 1;
            int undoIndex = result.size() - 1 - undoCount;
            if(undoIndex < 0) {
                undoIndex = 0;
                undoCount = 0;
            }
            String undoResult = result.get(undoIndex);
            return undoResult;
        }

        if(commandNum == 5) {
            int redoIndex = result.size() - 1 - undoCount + 1;
            if(redoIndex > result.size() - 1) {
                redoIndex = result.size() - 1;
            }
            String redoResult = result.get(redoIndex);
            if(undoCount > 0) {
                undoCount--;
            }
            return redoResult;
        }

        return result.get(result.size() - 1);
    }
}