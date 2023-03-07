import java.util.Arrays;
import java.util.Scanner;

public class Bia27_mang {
    public static void main(String[] args) {
        Scanner khoitao=new Scanner(System.in);
        System.out.println("Moi nhap vao phan tu mang:");
        int n= khoitao.nextInt();
        int mang[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("A["+i+"]:");
            mang[i]= khoitao.nextInt();
        }
        System.out.println("xuat mang:");
        System.out.print(Arrays.toString(mang)+"\t");

        //dao nguoc mang
        for(int i=0,j=mang.length-1 ;i<j;i++,j--)
        {
            int temp=mang[i];
            mang[i]=mang[j];
            mang[j]=temp;
        }
        System.out.println("\n mang sau khi dao nguoc la:");
        System.out.print(Arrays.toString(mang));

        Arrays.sort(mang);
        System.out.println("\nmang sau sx la:");
        System.out.println(Arrays.toString(mang));

        //tong
        int tong=0;
        for(int i=0;i<n;i++)
            tong=tong+mang[i];
        System.out.println("tong la:"+tong);

        System.out.println("\n moit nhap vao mot so:");
        int so=khoitao.nextInt();
        boolean ktra=false;
        String vitri="";
        for(int i=0;i<n;i++)
        {
            if(mang[i]==so)
            {
                ktra=true;
                vitri+=(i+" ");
            }
        }
        if(ktra)
            System.out.println(so+" co ton tai trong mang voi vi tri la +"+vitri);
        else
            System.out.println(so+" khong ton ntai trong mang");
    }
}
