package CongTY;

public class test {
    public static void main(String[] args) {
        NhanVien nv1=new NhanVien("nhan vien 1","bac ninh",123456);
        double luongnv1=nv1.tinhLuong();
        System.out.println("luong nv1:"+luongnv1);

        //tao doi utong la nhan vien hanh chinh
        NhanVienHanhChinh hc1=new NhanVienHanhChinh("hc1","ha noi",1234);
        double luonghc1=hc1.tinhLuong();
        System.out.println("luong hc1:"+luonghc1);

        NhanVienDiCa ca1=new NhanVienDiCa("dica","ha noi",555);
        double luongca1= ca1.tinhLuong();
        System.out.println("luongn ca1:"+luongca1);
    }
}
