import java.util.*;
public class FindValueOfName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<26;i++){
            map.put((char)('a'+i),i);
        }
        System.out.println("Enter your name in lowercase:- ");
        String name=sc.next();
        String value="";
        for(char ch:name.toCharArray()){
            value+=map.get(ch);
        }
        System.out.println(value);
    }
}