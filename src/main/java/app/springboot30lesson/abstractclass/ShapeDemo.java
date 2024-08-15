package app.springboot30lesson.abstractclass;

/**
 * @author it.Baonk.
 * @mail: bao.nguyenkhac@ivnd.com.vn
 * @Date: 15/08/2024
 */

public class ShapeDemo {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3, "Rectangle");
        System.out.println(rectangle.area());
        rectangle.moveTo(1, 2);

        System.out.println("================================================");
        Shape circle = new Circle(4, "Circle");
        System.out.println(circle.area());
        circle.moveTo(5, 6);
    }
}
