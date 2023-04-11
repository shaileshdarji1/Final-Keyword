public class Circle {

    final double PI = Math.PI;

    public final void area(double radius) {
        System.out.println("Area:" + PI * radius * radius);
    }

    public void diameter(double radius) {
        System.out.println("Diameter:" + 2 * radius);
    }
}
