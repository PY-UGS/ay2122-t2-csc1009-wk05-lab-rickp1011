public abstract class Shape {
    public double dim1;
    public double dim2;
    public double Pi;

    public Shape(double dim1, double dim2, double pi) {
        this.dim1 = dim1;
        this.dim2 = dim2;
        Pi = pi;
    }

    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public abstract double area();
}
