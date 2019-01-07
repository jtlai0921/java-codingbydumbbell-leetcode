package problems;

public class CountAndSay {

    public static void main(String[] args) {
        int i = 6;

        String res = new CountAndSay().countAndSay(i);
        System.out.println(res);
    }

    public String countAndSay(int n) {

        // 起始項
        if (n == 1) return "1";

        // 尾端的空字符是為了方便目標字串最末位的判斷
        String str = countAndSay(n - 1) + " ";

        StringBuilder res = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {

            // 判斷該字元與下一字元是否相同, 相同則計數
            if (str.charAt(i) == str.charAt(i + 1)) count++;
            else { // 不同則文字化
                res.append(count).append(str.charAt(i));

                //初始化計數器
                count = 1;
            }
        }
        return res.toString();
    }
}
