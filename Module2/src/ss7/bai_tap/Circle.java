package ss7.bai_tap;

/**
 * Author Minh C0323G1
 * Lớp Hình trong trong hình học
 * Mạc định bán kính = 2.0
 * Công thức tích diện tích Bán Kinh X Bán kính X Số PI
 */
public class Circle extends Shape {
    private double radius = 2.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
