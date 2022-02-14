public class square extends Shape {
    public square(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        System.out.println("Inside area for square ");
        double area = dim1*dim2;
        return area;
    }
}
