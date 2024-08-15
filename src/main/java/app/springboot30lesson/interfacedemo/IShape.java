package app.springboot30lesson.interfacedemo;

/**
 * @author it.Baonk.
 * @mail: bao.nguyenkhac@ivnd.com.vn
 * @Date: 15/08/2024
 */
public interface IShape {
    double calculateArea();
    void moveTo(double x, double y);
    void draw();
}
