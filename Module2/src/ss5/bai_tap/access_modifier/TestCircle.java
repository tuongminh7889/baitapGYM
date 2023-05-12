package ss5.bai_tap.access_modifier;
public class TestCircle{
    public static void main(String[] args) {
        AccessModifier circle = new AccessModifier(1);
        System.out.println("Radius of circle is : "+circle.getRadius());
        System.out.println("Area of circle is : " +circle.getArea());
    }
}
