public class IntersectionOfTwoArray{
   public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
          Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : a) {
            set1.add(num);
        }
        
        for (int num : b) {
            set2.add(num);
        }
        
        set1.retainAll(set2);
        return set1.size();
    }
}
