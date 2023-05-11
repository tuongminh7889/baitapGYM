package ss4.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {

    double a;
    double b;
    double c;
    double delta = getDiscriminant(this.a, this.b, this.c);

    public double getDiscriminant(double a, double b, double c) {
        delta = b * b - 4.0 * a * c;
        return delta;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void Result(double delta, double a, double b, double c) {
        if (delta > 0.0) {
            double r1 = (-b + Math.pow(delta, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(delta, 0.5)) / (2.0 * a);
            System.out.println(r1 + "" + r2);

        } else if (delta == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The equation has one root " + r1);
        } else {
            System.out.println("The equation has no real roots ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input a");
        double a = scanner.nextDouble();
        System.out.print("input b");
        double b = scanner.nextDouble();
        System.out.print("input c");
        double c = scanner.nextDouble();
        QuadraticEquation BuildClassQuadraticEquation = new QuadraticEquation(a, b, c);
        BuildClassQuadraticEquation.Result(BuildClassQuadraticEquation.delta, a, b, c);
    }
}