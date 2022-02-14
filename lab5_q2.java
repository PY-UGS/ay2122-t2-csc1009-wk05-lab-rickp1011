
public class lab5_q2 {
    public static  void main(String [] args){
        Rect r = new Rect(9,5);
        Tri t = new Tri(10,8);
        Cir c = new Cir(5,5,Math.PI);
        Ellipse e = new Ellipse(7,7,Math.PI);
        square s = new square(6,6);
        Shape figuref;
        figuref = r;
        System.out.println("area is " + figuref.area());
        figuref = t;
        System.out.println("area is " + figuref.area());
        figuref =c;
        System.out.println("area is " + figuref.area());
        figuref = e;
        System.out.println("area is " + figuref.area());
        figuref = s;
        System.out.println("area is " + figuref.area());
    }
}
