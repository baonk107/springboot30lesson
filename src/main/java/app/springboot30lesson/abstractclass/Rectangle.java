package app.springboot30lesson.abstractclass;

/**
 * @author it.Baonk.
 * @mail: bao.nguyenkhac@ivnd.com.vn
 * @Date: 15/08/2024
 */
public class Rectangle extends Shape{
    double length;
    double width;

    Rectangle(double length, double width, String name) {
        super(name);  //Gọi để constructor class cha để truyền vào name
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    void draw() {
        System.out.println(this.name + " has been drawn");
    }
}
