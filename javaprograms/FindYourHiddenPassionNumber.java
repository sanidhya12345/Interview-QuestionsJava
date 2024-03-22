import java.util.*;
public class FindYourHiddenPassionNumber {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your first name:- ");
       String first=sc.next();
       System.out.println("Enter your last name:- ");
       String last=sc.next();
       char [][] matrix=new char[3][9];
       int index=0;
       for(int i=0;i<3;i++){
        for(int j=0;j<9;j++){
            if(index!=27){
                matrix[i][j]=(char)('a'+index);
                index++;
            }
        }
       }
       HashMap<Character,Integer> numer=new HashMap<>();
       for(int i=0;i<3;i++){
        for(int j=0;j<9;j++){
            if(matrix[i][j]!='{'){
                numer.put(matrix[i][j],j+1);
                index++;
            }
        }
       }
       String fullname=first+last;
       HashMap<Integer,Integer> map=new HashMap<>();
       for(Character ch:fullname.toCharArray()){
            int num=numer.get(ch);
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                map.put(num,map.get(num)+1);
            }
       }
       int maxCount=Collections.max(map.values());
       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
           if(entry.getValue()==maxCount){
              System.out.println("Wow your hidden passion number is:- "+entry.getKey());
              break;
           }
       }
    }
}