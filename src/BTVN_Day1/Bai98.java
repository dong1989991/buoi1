package BTVN_Day1;

import java.util.Scanner;

public class Bai98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải hệ phương trình bạc nhất hai ẩn:");
        System.out.println("Ax+By=c");
        System.out.println("Dx+Ey=f");
        System.out.print("Nhập hệ số a của biến x: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b của biến y: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hằng số c: ");
        double c = scanner.nextDouble();
        System.out.print("Nhập hệ số d của biến x trong mệnh đề thứ 2: ");
        double d = scanner.nextDouble();
        System.out.print("Nhập hệ số e của biến y trong mệnh đề thứ 2: ");
        double e = scanner.nextDouble();
        System.out.print("Nhập hằng số f: ");
        double f = scanner.nextDouble();

        double congThuc = a * e - b * d;

        if (congThuc == 0) {
            System.out.println("Hệ phương trình vô nghiệm");
        } else {
            double x = (c * e - b * f) / congThuc;
            double y = (a * f - c * d) / congThuc;

            System.out.printf("Nghiệm của hệ phương trình là x = %.2f và y = %.2f", x, y);
        }
    }
}
