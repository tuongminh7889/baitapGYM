package ss1.bai_tap;

import java.util.Scanner;
public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        int so;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so bat ky: ");
        so = Integer.parseInt(scanner.nextLine());
        int donViTram = so % 100;
        if (so > 100 && so < 1000 || so<10) {
            switch (so / 100) {
                case 1:
                    System.out.print("one ");
                    break;
                case 2:
                    System.out.print("two ");
                    break;
                case 3:
                    System.out.print("three ");
                    break;
                case 4:
                    System.out.print("four ");
                    break;
                case 5:
                    System.out.print("five ");
                    break;
                case 6:
                    System.out.print("six ");
                    break;
                case 7:
                    System.out.print("seven ");
                    break;
                case 8:
                    System.out.print("eight ");
                    break;
                case 9:
                    System.out.print("nine ");
                    break;
            }
            System.out.print("hundred ");
            if (donViTram > 0) {
                System.out.print("and ");
            }
            switch (donViTram) {
                case 11:
                    System.out.print("eleven ");
                    break;
                case 12:
                    System.out.print("twelve ");
                    break;
                case 13:
                    System.out.print("thirteen ");
                    break;
                case 15:
                    System.out.print("fifteen ");
                    break;
            }
            switch (donViTram / 10) {
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("thirty ");
                    break;
                case 4:
                    System.out.print("fourty ");
                    break;
                case 5:
                    System.out.print("fifty ");
                    break;
                case 6:
                    System.out.print("sixty ");
                    break;
                case 7:
                    System.out.print("seventy ");
                    break;
                case 8:
                    System.out.print("eighty ");
                    break;
                case 9:
                    System.out.print("ninety ");
                    break;
            }
            switch (donViTram % 10) {
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
            if (donViTram > 13 && donViTram != 15 && donViTram < 20) {
                System.out.print("teen");
            }
        } else if (so > 20) {
            switch (donViTram / 10) {
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("thirty ");
                    break;
                case 4:
                    System.out.print("forty ");
                    break;
                case 5:
                    System.out.print("fifty ");
                    break;
                case 6:
                    System.out.print("sixty ");
                    break;
                case 7:
                    System.out.print("seventy ");
                    break;
                case 8:
                    System.out.print("eighty ");
                    break;
                case 9:
                    System.out.print("ninety ");
                    break;
            }
            switch (donViTram % 10) {
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
        } else if (so > 10) {
            switch (so) {
                case 11:
                    System.out.print("eleven ");
                    break;
                case 12:
                    System.out.print("twelve ");
                    break;
                case 13:
                    System.out.print("thirteen ");
                    break;
                case 14:
                    System.out.print("fourteen ");
                    break;
                case 15:
                    System.out.print("fifteen ");
                    break;
                case 16:
                    System.out.print("sixteen ");
                    break;
                case 17:
                    System.out.print("seventeen ");
                    break;
                case 18:
                    System.out.print("eighteen ");
                    break;
                case 19:
                    System.out.print("nineteen ");
                    break;
            }
        } else {
            switch (so) {
                case 0:
                    System.out.print("zero");
                    break;
                case 10:
                    System.out.print("tens");
                    break;
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
                default:
                    System.out.println("out of ability");
            }
        }
    }
}