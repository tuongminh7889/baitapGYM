package ss6.bai_tap.circle_cylinder;

import com.sun.corba.se.impl.interceptors.PICurrent;

public class Circle {
    private double radius = 2.0;
    private String corlor = "black";

    public Circle() {
    }

    public Circle(double radius, String corlor) {
        this.radius = radius;
        this.corlor = corlor;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getCorlor() {
        return corlor;
    }

    public void setCorlor(String corlor) {
        this.corlor = corlor;
    }

    /**
     * @return công thức diện tích là bình phương bán kính nhân số PI
     */
    public double getArea() {
        return (this.radius * this.radius) * 3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", corlor='" + corlor +
                ", area =" + getArea() + '\'' +
                '}';
    }
}
