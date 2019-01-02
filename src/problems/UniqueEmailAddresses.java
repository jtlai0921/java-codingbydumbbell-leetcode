package problems;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

    public static void main(String[] args) {

        String[] strings = {"test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};

        int res = new UniqueEmailAddresses().numUniqueEmails(strings);
        System.out.println(res);
    }

    public int numUniqueEmails(String[] emails) {

        Set<String> set = new HashSet<>();

        for (String s : emails) {

            // 將 email 分成 local name 和 domain name
            String[] strings = s.split("@");

            // 針對 local name 部分處理, 先處理 + 號, 再處理 ., 最後透過 set 不重覆特性來過濾
            set.add(strings[0].split("\\+")[0].replace(".", "") + "@" + strings[1]);
        }
        return set.size();
    }
}
