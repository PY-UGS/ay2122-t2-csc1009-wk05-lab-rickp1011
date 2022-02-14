public class Tri extends Shape {


    public Tri(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        System.out.println("Inside area for triangle");
        double area = 0.5*dim1*dim2;
        return area;
    }
}
