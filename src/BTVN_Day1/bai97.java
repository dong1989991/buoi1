package BTVN_Day1;

import java.util.Scanner;

public class bai97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Đây không phải là tam giác");
        } else if (a == b && b == c) {
            System.out.println("Đây là tam giác đều");
        } else if (a == b || b == c || a == c) {
            System.out.println("Đây là tam giác cân");
        } else if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
            System.out.println("Đây là tam giác vuông");
        } else {
            System.out.println("Đây là tam giác thường");
        }
}}
