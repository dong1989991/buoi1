package HinhTron_OOP;

import java.util.Random;
import java.util.Scanner;

public class ClassHinhTron {
    public static void main(String[] args) {
        // nhap kich thuoc
        Scanner khoitao=new Scanner(System.in);
        System.out.print("nhap so luong hinh tron:");
        int n= khoitao.nextInt();

        //tao mang
        HamHinhTron[] mang=new HamHinhTron[n];
        Random r=new Random();
        for(int i=0;i<n;i++)
        {
            int k=r.nextInt(20)+1;
            mang[i]=new HamHinhTron(k);
        }
        for (HamHinhTron ht : mang) {
            System.out.println(ht.toString());
        }
        // in ra hinh tron co chu vi lon nhat
        double cvMax=0;
        HamHinhTron tmp=null;
        for(HamHinhTron h : mang)
        {
            if (cvMax < h.tinhChuVi()) {
                cvMax = h.tinhChuVi();
                tmp = h;
            }
        }
        System.out.println("Hinh tron co chu vi lon nhat: " + tmp.toString());


    }
}
