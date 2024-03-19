import java.util.*;
public class IsSorted {
    public static boolean isSorted(int [] arr,int i,int j,int length){
        if(i==length-1){
            return true;
        }
        if(arr[i]>arr[j]){
            return false;
        }
        return isSorted(arr,i+1,j+1,length);
    }
    public static void main(String[] args) {
       int [] arr={1,2,10,5,6};
       boolean ans=isSorted(arr,0,1,5);
       System.out.println(ans);
    }
}