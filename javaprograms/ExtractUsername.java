import java.util.*;
public class ExtractUsername {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter email id:- ");
      String email=sc.nextLine();
      String extract="";
      for(Character ch:email.toCharArray()){
        if(ch!='@'){
            extract+=ch;
        }
        if(ch=='@'){
            break;
        }
      }
      System.out.println("Extract username is :- "+extract);
    }
}