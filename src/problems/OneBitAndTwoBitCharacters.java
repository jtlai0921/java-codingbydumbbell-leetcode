package problems;

public class OneBitAndTwoBitCharacters {

    public static void main(String[] args) {
        int[] bits = {0, 0, 0};
        boolean res = new OneBitAndTwoBitCharacters().isOneBitCharacter(bits);
        System.out.println(res);

        boolean test = new OneBitAndTwoBitCharacters().isOneBitCharacter2(bits);
        System.out.println(test);
    }


    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 2) if (bits[i++] == 1) i++;
        return bits[i] == 0;
    }

    public boolean isOneBitCharacter2(int[] bits) {
        int len = bits.length;
        if (len < 2) return true;
        if (bits[len - 1] == 1) return false;
        for (int i = len - 2; i >= 0; i--) {
            if (bits[i] == 0) {
                len -= (i + 1);
                break;
            }
        }
        return len % 2 == 1;
    }
}
