package OOP_nha.bai1;

public class bai35_main {
    public static void main(String[] args) {
        Bai35_ngay ngay1=new Bai35_ngay(15,5,2021);
        Bai35_ngay ngay2=new Bai35_ngay(16,6,2022);
        Bai35_ngay ngay3=new Bai35_ngay(17,7,2022);

        bai35_tacGia tacGia1=new bai35_tacGia("doan dong",ngay1);
        bai35_tacGia tacGia2=new bai35_tacGia("doan van",ngay2);
        bai35_tacGia tacGia3=new bai35_tacGia("doan thu",ngay3);

        Bai35_sach sach1=new Bai35_sach("lap trinh c",20000,2023,tacGia1);
        Bai35_sach sach2=new Bai35_sach("lap trinh d",30000,2022,tacGia2);
        Bai35_sach sach3=new Bai35_sach("lap trinh e",40000,2023,tacGia3);
        sach1.inTenSach();
        sach2.inTenSach();
        sach3.inTenSach();

        System.out.println("so sanh sach 1 va 3:"
                +sach1.kiemTraCungNamXuatBan(sach3));
        System.out.println("Sach 1 gia cu:"+sach1.getGiaBan());
        System.out.println("sach  1 giam 10%:"+sach1.giaSauKhiGiam(10));

    }
}
