

public class Cir extends Shape{


    public Cir(double dim1, double dim2, double pi) {
        super(dim1, dim2, pi);
    }

    @Override
    public double area() {
        System.out.println("Inside area for circle ");
        double area = Pi*Math.pow(dim1,2);
        return area;
    }
}
