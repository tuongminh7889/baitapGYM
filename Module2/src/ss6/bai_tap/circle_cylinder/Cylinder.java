package ss6.bai_tap.circle_cylinder;

import ss5.bai_tap.access_modifier.AccessModifier;

public class Cylinder extends Circle {
    private double hight;

    public Cylinder() {

    }

    public Cylinder(double radius, String corlor, double hight) {
        super(radius, corlor);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    /**
     * @return công thức tính thể tích : diện tích đáy nhân chiều cao
     */
    public double getVolumn() {
        return getArea() * this.hight;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "hight=" + getHight() +
                ", radius=" + getRadius() +
                ", corlor='" + getCorlor() + '\'' +
                ", area =" + getArea() +
                ", volumn =" + getVolumn() +
                '}';
    }
}
