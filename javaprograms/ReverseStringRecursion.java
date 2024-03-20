import java.util.*;
public class ReverseStringRecursion {
    public static String ans="";
    public static void reverse(String s,int index){
        if(index<0){
            return;
        }
        ans+=s.charAt(index);
        reverse(s,index-1);
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int length=s.length();
      reverse(s,length-1);
      System.out.println(ans);
    }
}