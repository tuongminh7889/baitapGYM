package ss7.bai_tap;

/**
 * Author Minh C0323G1
 * Lớp hình vuông trong hình học
 * Mạc định cạnh bằng 2
 * công thức chu vi và cạnh X4
 * công thức diện tích Cạnh X Cạnh
 */
public class Square extends Shape {
    private double side = 2.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * this.side;
    }

    public double getPrimetter() {
        return side * 4;
    }


    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", which is a subclass of " + super.toString() + "}";
    }
}
