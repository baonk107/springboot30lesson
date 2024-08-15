package app.springboot30lesson.abstractclass;

/**
 * @author it.Baonk.
 * @mail: bao.nguyenkhac@ivnd.com.vn
 * @Date: 15/08/2024
 */
public abstract class Shape {
    protected String name = "";

    Shape(String name) {
        this.name = name;
    }

    public void moveTo(double x, double y) {
        System.out.println(this.name + " has moved to x = " + x + ", y = " + y);
    }

    abstract double area();
    abstract void draw();
}
