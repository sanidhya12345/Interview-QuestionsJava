public class MetTheirTargetEasy {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(Integer i:hours){
            if(i>=target){
                count++;
            }
        }
        return count;
    }
}
