package ss2.bai_tap;

import java.util.Scanner;

public class Show20Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input quantity primes :");
        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int n = 2;
        while (count < number) {
            int count1 = 0;
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    count1++;
                }
            }
            if (count1 == 1) {
                count++;
                System.out.print(" " + n);
            }
            n++;
        }
    }
}
