package ss4.bai_tap;

public class QuadraticEquation {

    double a;
    double b;
    double c;
double delta;

    public double getDiscriminant(double a ,double b, double c) {
         delta = b * b - 4.0 * a * c;
        return delta ;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //if(delta >0.0)


    public double getRoot1(double a , double b, double delta) { double r1 = (-b + Math.pow(delta, 0.5)) / (2.0 * a);}
        double r2 = (-b - Math.pow(delta, 0.5)) / (2.0 * a);
        System.out.println("The equation has two root " + r1 + " and " + r2);
    // else if(delta ==0.0)

    {
        double r1 = -b / (2.0 * a);
        System.out.println("The equation has one root " + r1);
    } else

    {
        System.out.println("The equation has no real roots ");
    }

}
    