public class Test {

    public static void main(String[] args) {

        // 相同的回傳 0
        System.out.println("A".compareTo("A"));

        // 不同，回傳首位不同字 Unicode 的差值
        System.out.println("A".compareTo("C"));
        System.out.println("AA".compareTo("AC"));

        // 若前面全部相同，只有長度不同，回傳長度差異
        System.out.println("我".compareTo("AAA"));
    }
}
