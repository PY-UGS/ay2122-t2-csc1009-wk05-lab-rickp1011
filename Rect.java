

public class Rect extends Shape {


    public Rect(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        System.out.println("Inside area for rectangle ");
        double area = dim1*dim2;
        return area;
    }
}
