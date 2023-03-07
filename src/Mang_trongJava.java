import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Mang_trongJava {
    public static void main(String[] args) {
        // khai ba mang
//        Scanner khoitao=new Scanner(System.in);
//        System.out.println("nhap vao so luong phan tu mang:");
//        int n= khoitao.nextInt();
//        int mang[]=new int[n];
//        for(int i=0;i<n;i++)
//        {
//            System.out.print("[A"+i+"]:");
//            mang[i]= khoitao.nextInt();
//        }
//        for(int i=0;i<n;i++)
//        {
//            System.out.print(mang[i]+"\t");
//        }
//        System.out.println("mang sau khi sx la:");
//        Arrays.sort(mang);
//        System.out.println(Arrays.toString(mang));


        // dao nguoc mang
        int mang2[]={2,3,4,5,6};
        for(int i=0,j=mang2.length-1;i<j;i++,j--)
        {
            int temp=mang2[i];
            mang2[i]=mang2[j];
            mang2[j]=temp;
        }
        System.out.print("mang sau dao nguoc la:");
        System.out.println(Arrays.toString(mang2));
    }
}
