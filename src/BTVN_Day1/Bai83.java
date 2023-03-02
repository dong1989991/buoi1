package BTVN_Day1;

import java.util.Scanner;

public class Bai83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        if(a == 0 && b == 0) {
            System.out.println("Phương trình có vô số nghiệm");
        } else if(a == 0 && b != 0) {
            System.out.println("Phương trình vô nghiệm");
        } else {
            double x = -b/a;
            System.out.printf("Nghiệm của phương trình %.2fx + %.2f = 0 là: %.2f", a, b, x);
        }

    }
}
