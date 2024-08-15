package app.springboot30lesson.interfacedemo;

/**
 * @author it.Baonk.
 * @mail: bao.nguyenkhac@ivnd.com.vn
 * @Date: 15/08/2024
 */
public class Rectangle1 implements IShape{
    double length, width;

    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void moveTo(double x, double y) {
        System.out.println("Moving rectangle to (" + x + ", " + y + ")");
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}
