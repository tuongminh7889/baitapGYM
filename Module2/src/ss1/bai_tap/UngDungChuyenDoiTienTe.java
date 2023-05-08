package ss1.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        int rate, usd, vnd;
        rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong USD: ");
        usd = scanner.nextInt();
        vnd = rate * usd;
        System.out.println("Chuyen doi bang " + vnd + "vnd");
    }
}
