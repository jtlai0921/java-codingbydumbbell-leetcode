package problems;

public class ImplementStrStr {

    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        int res = new ImplementStrStr().strStr(haystack, needle);
        System.out.println(res);
    }

    public int strStr(String haystack, String needle) {

        // 如果 needle 是空字串，則返回 0
        if (needle.isEmpty()) return 0;
        for (int i = 0; i < haystack.length(); i++) {

            // 如果 needle + 已辨識長度 > haystack，那就代表，此次匹配失敗
            if (i + needle.length() > haystack.length()) return -1;

            // 如果 haystack 某個字元等於 needle 的第一個字元，則開始匹配
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j;

                // 第一個字元剛剛匹配啦，所以這裡就從第二個字元匹配到最後
                for (j = 1; j < needle.length(); j++) {

                    // 匹配失敗，跳過這次匹配
                    if (haystack.charAt(i + j) != needle.charAt(j)) break;
                }

                // 若 j 等於 needle 的長度，代表完全匹配，返回 i
                if (j == needle.length()) return i;
            }
        }
        return -1;
    }
}
