import java.util.*;

public class Level1 {
    public static int PrintingCosts(String Line) {
        int sumСonsumption = 0;
        HashMap<Character, Integer> tonerСonsumption = new HashMap<Character, Integer>();

        tonerСonsumption.put(' ', 0);
        tonerСonsumption.put('!', 9);
        tonerСonsumption.put('"', 6);
        tonerСonsumption.put('#', 24);
        tonerСonsumption.put('$', 29);
        tonerСonsumption.put('%', 22);
        tonerСonsumption.put('&', 24);
        tonerСonsumption.put('\'', 3);
        tonerСonsumption.put('(', 12);
        tonerСonsumption.put(')', 12);
        tonerСonsumption.put('*', 17);
        tonerСonsumption.put('+', 13);
        tonerСonsumption.put(',', 7);
        tonerСonsumption.put('-', 7);
        tonerСonsumption.put('.', 4);
        tonerСonsumption.put('/', 10);
        tonerСonsumption.put('0', 22);
        tonerСonsumption.put('1', 19);
        tonerСonsumption.put('2', 22);
        tonerСonsumption.put('3', 23);
        tonerСonsumption.put('4', 21);
        tonerСonsumption.put('5', 27);
        tonerСonsumption.put('6', 26);
        tonerСonsumption.put('7', 16);
        tonerСonsumption.put('8', 23);
        tonerСonsumption.put('9', 26);
        tonerСonsumption.put(':', 8);
        tonerСonsumption.put(';', 11);
        tonerСonsumption.put('<', 10);
        tonerСonsumption.put('=', 14);
        tonerСonsumption.put('>', 10);
        tonerСonsumption.put('?', 15);
        tonerСonsumption.put('@', 32);
        tonerСonsumption.put('A', 24);
        tonerСonsumption.put('B', 29);
        tonerСonsumption.put('C', 20);
        tonerСonsumption.put('D', 26);
        tonerСonsumption.put('E', 26);
        tonerСonsumption.put('F', 20);
        tonerСonsumption.put('G', 25);
        tonerСonsumption.put('H', 25);
        tonerСonsumption.put('I', 18);
        tonerСonsumption.put('J', 18);
        tonerСonsumption.put('K', 21);
        tonerСonsumption.put('L', 16);
        tonerСonsumption.put('M', 28);
        tonerСonsumption.put('N', 25);
        tonerСonsumption.put('O', 26);
        tonerСonsumption.put('P', 23);
        tonerСonsumption.put('Q', 31);
        tonerСonsumption.put('R', 28);
        tonerСonsumption.put('S', 25);
        tonerСonsumption.put('T', 16);
        tonerСonsumption.put('U', 23);
        tonerСonsumption.put('V', 19);
        tonerСonsumption.put('W', 26);
        tonerСonsumption.put('X', 18);
        tonerСonsumption.put('Y', 14);
        tonerСonsumption.put('Z', 22);
        tonerСonsumption.put('[', 18);
        tonerСonsumption.put('\\', 10);
        tonerСonsumption.put(']', 18);
        tonerСonsumption.put('^', 7);
        tonerСonsumption.put('_', 8);
        tonerСonsumption.put('`', 3);
        tonerСonsumption.put('a', 23);
        tonerСonsumption.put('b', 25);
        tonerСonsumption.put('c', 17);
        tonerСonsumption.put('d', 25);
        tonerСonsumption.put('e', 23);
        tonerСonsumption.put('f', 18);
        tonerСonsumption.put('g', 30);
        tonerСonsumption.put('h', 21);
        tonerСonsumption.put('i', 15);
        tonerСonsumption.put('j', 20);
        tonerСonsumption.put('k', 21);
        tonerСonsumption.put('l', 16);
        tonerСonsumption.put('m', 22);
        tonerСonsumption.put('n', 18);
        tonerСonsumption.put('o', 20);
        tonerСonsumption.put('p', 25);
        tonerСonsumption.put('q', 25);
        tonerСonsumption.put('r', 13);
        tonerСonsumption.put('s', 21);
        tonerСonsumption.put('t', 17);
        tonerСonsumption.put('u', 17);
        tonerСonsumption.put('v', 13);
        tonerСonsumption.put('w', 19);
        tonerСonsumption.put('x', 13);
        tonerСonsumption.put('y', 24);
        tonerСonsumption.put('z', 19);
        tonerСonsumption.put('{', 18);
        tonerСonsumption.put('|', 12);
        tonerСonsumption.put('}', 18);
        tonerСonsumption.put('~', 9);

        for(int i = 0; i < Line.length(); i ++) {
            char current = Line.charAt(i);
            if(tonerСonsumption.containsKey(current)) {
                sumСonsumption += tonerСonsumption.get(current);
            }
            if(! tonerСonsumption.containsKey(current)) {
                sumСonsumption += 23;
            }
        }

        return sumСonsumption;
    }
}