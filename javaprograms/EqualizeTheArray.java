import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class EqualizeTheArray{
   public static int equalizeArray(List<Integer> arr) {
    // Write your code here
    HashMap<Integer,Integer> map=new HashMap<>();
    for(Integer i:arr){
        if(!map.containsKey(i)){
            map.put(i,1);
        }
        else{
            map.put(i,map.get(i)+1);
        }
    }
       int maxCount=Collections.max(map.values());
       return arr.size()-maxCount;
    }
}
