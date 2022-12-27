
public class NumberComplement {

    public static int findComplement(int i) {
        int ones = (Integer.highestOneBit(i) << 1) - 1;
        return i ^ ones;
    }
}
