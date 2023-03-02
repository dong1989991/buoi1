package BTVN_Day1;

import java.util.Scanner;

public class bai96 {
    public static void main(String[] args) {
        Scanner khoiTao=new Scanner(System.in);
        System.out.print("Nhap x:");
        float x=khoiTao.nextFloat();
        float f;
        if (x>=5)
             f=2*x*x+5*x+9;
        else
            f=-2*x*x+5*x-9;
        System.out.print("KQ:"+f);

    }
}
