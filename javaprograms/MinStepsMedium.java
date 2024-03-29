public class MinStepsMedium {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
        }
        int count=0;
        for(char ch:t.toCharArray()){
            if(map.containsKey(ch) && map.get(ch)>0){
                map.put(ch,map.get(ch)-1);
            }
            else{
                count++;
            }
        }
        return count;
    }
}
