

public class ReverseString {
    /**
     * The idea is to start swapping elements (a[i] with a[a.length-i])
     * */
    static public String reverseString(String s) {
        char[] a = s.toCharArray();
        int n = a.length - 1;

        for (int i = (n - 1) / 2; i >= 0; i--) {
            char temp = a[i];
            a[i] = a[n - i];
            a[n - i] = temp;
        }
        return String.valueOf(a);
    }


}
