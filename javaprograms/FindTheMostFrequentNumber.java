import java.util.*;

public class FindTheMostFrequentNumber {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array:-");
      int size=sc.nextInt();
      System.out.println("Enter the elements of array:- ");
      int [] array=new int[size];
      //store the element in array.
      for(int i=0;i<size;i++){
        array[i]=sc.nextInt();
      }
      //put the count of every element occur in array.
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<size;i++){
        if(!map.containsKey(array[i])){
            map.put(array[i],1);
        }
        else{
            map.put(array[i],map.get(array[i])+1);
        }
      }
      //find the most count value in the array.
      int countMax=Collections.max(map.values());
      //find the most frequent integer of array using Map.Entry
      for(Map.Entry<Integer,Integer> entry:map.entrySet()){
         if(entry.getValue()==countMax){
            System.out.println("Highest Frequent Integer is: "+entry.getKey());
         }
      }
    }
}