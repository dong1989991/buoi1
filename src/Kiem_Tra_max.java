import java.util.Scanner;

public class Kiem_Tra_max {
    public static void main(String[] args) {
        Scanner khoiTao = new Scanner(System.in);
        System.out.println("nhap vao so luong cua mang:");
        int n= khoiTao.nextInt();
        int mang[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("A["+i+"]:");
            mang[i]= khoiTao.nextInt();

        }
        int max=mang[0];
        for(int i=0;i<n;i++)
        {
 if(mang[i]>max)
            {
      max=mang[i];
            }


        }
        System.out.println("phan tu lon nhat trong mang la:"+max);


    }
}
