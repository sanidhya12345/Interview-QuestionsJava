
import java.util.*;

public class FindTheMiddleIndex {
    public static int findMiddleIndex(int[] nums) {
        for(int middle=0;middle<nums.length;middle++){
            int leftSum=0;
            int rightSum=0;
            if(middle==0){
              leftSum=0;
            }
            else if(middle==nums.length-1){
                rightSum=0;
            }
            for(int i=0;i<middle;i++){
                leftSum+=nums[i];
            }
            for(int j=middle+1;j<nums.length;j++){
                rightSum+=nums[j];
            }
           if(leftSum==rightSum){
            return middle;
           }
        }
        return -1;
    }
    public static void main(String[] args) {
       int [] arr={2,3,-1,8,4};
       System.out.println(findMiddleIndex(arr));
    }
}