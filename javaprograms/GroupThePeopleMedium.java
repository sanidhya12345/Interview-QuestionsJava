public class GroupThePeopleMedium {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<groupSizes.length;i++){
            map.put(i,groupSizes[i]);
        }
        boolean [] visited=new boolean[groupSizes.length];
        for(Integer i:map.values()){
            int count=0;
            List<Integer> subList=new ArrayList<>();
            for(int id:map.keySet()){
                if(i==map.get(id) && visited[id]==false){
                    subList.add(id);
                    visited[id]=true;
                    count++;
                }
                if(count==i){
                    list.add(subList);
                    break;
                }
            }
        }
        // System.out.println(Arrays.toString(visited));
        return list;
    }
}
