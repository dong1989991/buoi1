package OOP_nha.bai1;

public class Bai36_main {
    public static void main(String[] args) {
        Bai36_ngay_chieu ngay1=new Bai36_ngay_chieu(15,5,2022);
        Bai36_ngay_chieu ngay2=new Bai36_ngay_chieu(13,3,2022);
        Bai36_ngay_chieu ngay3=new Bai36_ngay_chieu(19,3,2022);

        Bai36_hang_san_xuat hangSanXuat1=new Bai36_hang_san_xuat("Tran Thanh","Viet Nam");
        Bai36_hang_san_xuat hangSanXuat2=new Bai36_hang_san_xuat("Truong giang","Viet Nam");
        Bai36_hang_san_xuat hangSanXuat3=new Bai36_hang_san_xuat("Winter join","Trung quoc");

        Bai36_bo_phim boPhim1 =new Bai36_bo_phim("phim hay",2022,hangSanXuat1,20000,ngay1);
        Bai36_bo_phim boPhim2 =new Bai36_bo_phim("phim te",2023,hangSanXuat2,30000,ngay2);
        Bai36_bo_phim boPhim3 =new Bai36_bo_phim("phim binh thuong",2022,hangSanXuat1,50000,ngay3);


        System.out.println("so sanh gia 1 va 2:"+boPhim1.kiemTraGiaVeHon(boPhim2));

        System.out.println("ten HSX cua bo phim 3:"+boPhim3.layTenHangSanXuat());

        System.out.println("bo phim 1 gia truoc giam:"+boPhim1.getGiaVe());
        System.out.println("bo ohim 1 sau km 10%:"+boPhim1.giaSauKM(10));



    }
}
