package problems;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String string = "abcabcbb";

        int res = new LongestSubstringWithoutRepeatingCharacters()
                .lengthOfLongestSubstring(string);
        System.out.println(res);
    }

    public int lengthOfLongestSubstring(String s) {

        if (s == null || s.isEmpty()) return 0;

        Map<Character, Integer> map = new HashMap<>();
        int res = 0;

        // i 是目前的位置, j 則代表不重覆起點的位置
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) // 如果遇到重覆的
                // 則更新不重覆起點的位置, 要注意的是, 如果遇到不同字母皆重覆, 如 "abba", 則不重覆起點必須取最新, 即最大那個
                j = Math.max(j, map.get(s.charAt(i)) + 1);

            // 將字, 位置放入 map 中, 若有相同的, 則 i 被更新
            map.put(s.charAt(i), i);

            // 計算長度, 並保留最大值
            res = Math.max(res, i - j + 1);
        }
        return res;
    }
}
