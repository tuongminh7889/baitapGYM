package ss4.bai_tap;

import java.util.Scanner;

public class BuildClassQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input a");
        double a = scanner.nextDouble();
        System.out.print("input b");
        double b = scanner.nextDouble();
        System.out.print("input c");
        double c = scanner.nextDouble();
        double discriminant = b * b - 4.0 * a * c;

        if (discriminant > 0.0) {
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
            System.out.println("The equation has two root " + r1 + " and " + r2);
        } else if (discriminant == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The equation has one root " + r1);
        } else {
            System.out.println("The equation has no real roots ");
        }

    }
}
    