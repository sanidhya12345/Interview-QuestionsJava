public class RowWIthMaxOnes {
    public int[] rowAndMaximumOnes(int[][] mat) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            int countOne=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    countOne++;
                }
            }
            map.put(i,countOne);
        }
        int [] ans=new int[2];
        int maxValue=Collections.max(map.values());
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==maxValue){
                ans[0]=entry.getKey();
                ans[1]=maxValue;
                break;
            }
        }
        return ans;
    }
}
