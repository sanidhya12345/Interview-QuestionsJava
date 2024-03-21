import java.util.*;
public class Main extends Calc{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first value:- ");
      int val1=sc.nextInt();
      System.out.println("Enter the second value:- ");
      int val2=sc.nextInt();
      Calc c=new Calc();
      c.var1=val1;
      c.var2=val2;
      System.out.println("Addition :- "+c.addition());
    }
}