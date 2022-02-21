
import java.util.Date;

public class circle extends Geometric_Object {
    public double radius;
    public double area;
    public double diameter;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public circle() {
    }

    public circle(double radius) {
        this.radius = radius;
    }
    public double getArea(double radius)
    {
        this.area = Math.PI*Math.pow(radius,2);
        return this.area;
    }
    public double getDiameter(double radius)
    {
        this.diameter = 2*radius;
        return this.diameter;
    }
    @Override
    public String toString() {
        String Color = color;
        String Filled = String.valueOf(filled);
        long millis=System.currentTimeMillis();
        java.util.Date date = new java.util.Date(millis);
        String hello = "is created on "+date+"\n"+"colour: "+Color+" and "+"filled: "+Filled;
        return hello;
    }
}
