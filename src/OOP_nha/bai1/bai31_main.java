package OOP_nha.bai1;

public class bai31_main {
    public static void main(String[] args) {
        bai31_hoaDonCaPhe hd=new bai31_hoaDonCaPhe("trungnguyen",200,3);
        bai31_hoaDonCaPhe hd1=new bai31_hoaDonCaPhe("trungnguyen",200,2);
        System.out.println("tong tien:"+hd.tinhTongTien());
        System.out.println("Kiem tra khoi luong  >2"+hd.kiemTraKhoiLuong(2));
        System.out.println("kiem tra tong tien lon hon 500:"+hd.kiemTraTongTien());
        System.out.println("hoa don dc giam gia:"+hd.giamGia(10));
        System.out.println("hoa don dc giam gia:"+hd1.giamGia(10));
        System.out.println("sau giam gia:"+hd.giaSauGiam(10));
    }
}
