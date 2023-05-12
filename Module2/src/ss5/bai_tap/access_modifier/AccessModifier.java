package ss5.bai_tap.access_modifier;

public class AccessModifier {
   private static double radius ;
   private static String color ;
   public final double PI = 3.14 ;
   public  AccessModifier (){
        radius = 1.0;
        color = "red";
   }
   public AccessModifier(double r){
       this.radius = r ;
   }

    public double getRadius() {
        return this.radius;
    }
    public double getArea(){
       return (this.radius*this.radius) * PI;
    }

    public static void setColor(String color) {
        AccessModifier.color = color;
    }



}
