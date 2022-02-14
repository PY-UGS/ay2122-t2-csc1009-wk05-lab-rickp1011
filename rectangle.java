

public class rectangle extends Geometric_Object {
    public double width;
    public double height;
    public double area;
    public double perimeter;


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public rectangle(String color, boolean filled, double width, double height) {
        super(color,filled);
        this.width = width;
        this.height = height;
    }

    public rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public rectangle() {
    }
    public double getArea(double width,double height){
         this.area = this.width * this.height;
         return this.area;
    }
    public double getPerimeter(double width,double height){
         this.perimeter = (this.width + this.height) * 2;
        return this.perimeter;
    }

    @Override
    public String toString() {
       String Color = color;
       String Filled = String.valueOf(filled);
       long millis=System.currentTimeMillis();
       java.util.Date date = new java.util.Date(millis);
       String hello = "is created on "+date+"\n"+"colour: "+Color+ " and "+"filled: "+Filled;
        return hello;
    }
}
