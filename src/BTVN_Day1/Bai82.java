package BTVN_Day1;

import java.util.Scanner;

public class Bai82 {

    public static void main(String[] args) {
        Scanner khoiTao=new Scanner(System.in);
        System.out.println("nhap vao a,b,c:");
        int a=khoiTao.nextInt();
        int b=khoiTao.nextInt();
        int c= khoiTao.nextInt();
        int max=a;
        if(b>max)
            max=b;
         if(c>max)
            max=c;
        System.out.println("max la:"+max);


    }

}
