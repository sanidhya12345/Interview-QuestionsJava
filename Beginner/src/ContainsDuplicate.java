
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    /**
     * In iteration of array We keep track of elements and in each iteration we need to check if this elements is
     * met already.
    * */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i)) return true;
        }
        return false;
    }
}
