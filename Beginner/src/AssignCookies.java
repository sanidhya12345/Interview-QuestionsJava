
import java.util.Arrays;

public class AssignCookies {
    /**
    * We sort both arrays and search greedily. Time complexity is O(NlgN)
    * */
    public int findContentChildren(int[] g, int[] s) {
        if (g.length == 0 || s.length == 0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int left = 0;
        int right = 0;
        int count = 0;
        while (left < g.length && right < s.length) {
            if (g[left] <= s[right]) {
                left++;
                right++;
                count++;
            } else right++;
        }
        return count;
    }
}
