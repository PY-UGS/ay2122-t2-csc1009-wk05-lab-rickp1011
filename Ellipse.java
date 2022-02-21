
public class Ellipse extends Shape{

    public Ellipse(double dim1, double dim2, double pi) {
        super(dim1, dim2, pi);
    }

    @Override
    public double area() {
        System.out.println("Inside area for ellipse ");
        double area = Pi*dim1*dim2;
        return area;
    }
}
