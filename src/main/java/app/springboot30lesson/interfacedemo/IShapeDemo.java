package app.springboot30lesson.interfacedemo;

/**
 * @author it.Baonk.
 * @mail: bao.nguyenkhac@ivnd.com.vn
 * @Date: 15/08/2024
 */
public class IShapeDemo {
    public static void main(String[] args) {
        IShape rectangle = new Rectangle1(4, 6);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        rectangle.moveTo(1, 2);
        System.out.println(" ");

        IShape circle = new Circle1(5);
        System.out.println("Circle area: " + circle.calculateArea());
        circle.moveTo(3, 4);
        circle.draw();

    }
}
