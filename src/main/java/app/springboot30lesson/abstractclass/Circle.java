package app.springboot30lesson.abstractclass;

/**
 * @author it.Baonk.
 * @mail: bao.nguyenkhac@ivnd.com.vn
 * @Date: 15/08/2024
 */
public class Circle extends Shape {
    double pi = 3.14;
    double radius;

    Circle(double radius, String name) {
        super(name);
        this.radius = radius;
    }

    @Override
    double area() {
        return (pi * radius * radius) / 2.0;
    }

    @Override
    void draw() {
        System.out.println(this.name + " has been drawn");
    }
}
