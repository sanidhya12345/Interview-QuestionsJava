
import java.util.ArrayList;
import java.util.List;


public class PascalsTriangle2 {
    public List<Integer> getRow(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            List<Integer> l = new ArrayList<>(i);
            if (i == 0) {
                l.add(1);
            } else {
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        l.add(1);
                    } else {
                        l.add(list.get(j) + list.get(j - 1));
                    }
                }
            }
            list = l;
        }
        return list;
    }
}
