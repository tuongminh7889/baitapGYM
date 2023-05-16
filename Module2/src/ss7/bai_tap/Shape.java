package ss7.bai_tap;

/**
 * Author Minh C0323G1
 * Tạo lớp Hình học với Interface là Resizeable
 * Mạc đình mà sắc và độ filled
 * Xuất ra thông tin màu sắc và bolean của filled
 */
public class Shape implements Resizeable {
    private String color = "green";
    private boolean filled = true;


    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}

