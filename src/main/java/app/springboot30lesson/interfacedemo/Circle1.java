package app.springboot30lesson.interfacedemo;

/**
 * @author it.Baonk.
 * @mail: bao.nguyenkhac@ivnd.com.vn
 * @Date: 15/08/2024
 */
public class Circle1 implements IShape{
    double pi = 3.14;
    double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (pi * radius * radius) / 2.0;
    }

    @Override
    public void moveTo(double x, double y) {
        System.out.println("Move circle to (" + x + ", " + y + ")");
    }

    @Override
    public void draw() {
        System.out.println("Draw circle");
    }
}
