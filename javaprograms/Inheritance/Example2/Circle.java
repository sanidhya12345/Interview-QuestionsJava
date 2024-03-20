import java.util.*;
public class Circle extends Shape {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int radius=sc.nextInt();
       double getPerimeter=getPerimeter(radius);
       double getArea=getArea(radius);
       System.out.println("Perimeter of circle:- "+getPerimeter);
       System.out.println("Area of circle:- "+getArea);
    }
}