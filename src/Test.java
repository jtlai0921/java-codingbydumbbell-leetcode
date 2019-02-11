import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        String p1 = map.put("11", "22");
        System.out.println("p1:" + p1);

        String p2 = map.put("33", "44");
        System.out.println("p2:" + p2);

        String value1 = map.get("11");
        System.out.println("value1:" + value1);

        String p3 = map.put("11", "44");
        System.out.println("p3：" + p3);

        String value2 = map.get("11");
        System.out.println("value2:" + value2);
    }
}

