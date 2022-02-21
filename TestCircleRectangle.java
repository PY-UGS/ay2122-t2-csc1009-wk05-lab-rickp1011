import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestCircleRectangle {
    public static  void main(String [] args){
        circle Circle = new circle(1);
        System.out.println("this circle " + Circle.toString());
        System.out.println("the colour is  " + Circle.getColor());
        System.out.println("the radius is " + Circle.getRadius());
        System.out.println("the area is " + Circle.getArea(Circle.radius));
        System.out.println("the diameter is  " + Circle.getDiameter(Circle.radius));
        rectangle Rectangle = new rectangle(2,4);
        System.out.println("this rectangle " + Rectangle.toString());
        System.out.println("this rectangle " + Rectangle.getArea(Rectangle.width, Rectangle.height));
        System.out.println("this rectangle " + Rectangle.getPerimeter(Rectangle.width, Rectangle.height));

    }
}
