package problems;

import java.util.ArrayList;
import java.util.List;

public class ShortestCompletingWord {

    public static void main(String[] args) {
        String licensePlate = "B687015", words[] = {"born", "give", "would", "nice", "in", "understand", "blue", "force", "have", "that"};
        String res = new ShortestCompletingWord().shortestCompletingWord(licensePlate, words);
        System.out.println(res);
    }

    public String shortestCompletingWord(String licensePlate, String[] words) {
        String codePlate = encode(licensePlate), res = null;
        for (String w : words)
            if (w.length() >= codePlate.length() && isFit(w, codePlate)) if (res == null || res.length() > w.length()) res = w;
        return res;
    }

    private String encode(String licensePlate) {
        String code = "";
        for (char c : licensePlate.toLowerCase().toCharArray()) if (Character.isLetter(c)) code += c;
        return code;
    }

    private boolean isFit(String w, String codePlate) {
        List<Character> ws = new ArrayList<>();
        for (Character c : w.toCharArray()) ws.add(c);
        for (Character c : codePlate.toCharArray()) if (!ws.remove(c)) return false;
        return true;
    }
}
