package OOP_nha.bai1;

public class Bai36_bo_phim {
    private String tenPhim;
    private int namSX;
    private Bai36_hang_san_xuat hangSX;
    private double giaVe;
    private Bai36_ngay_chieu ngayChieu;

    public Bai36_bo_phim(String tenPhim, int namSX, Bai36_hang_san_xuat hangSX, double giaVe, Bai36_ngay_chieu ngayChieu) {
        this.tenPhim = tenPhim;
        this.namSX = namSX;
        this.hangSX = hangSX;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public int getNamSX() {
        return namSX;
    }

    public Bai36_hang_san_xuat getHangSX() {
        return hangSX;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public Bai36_ngay_chieu getNgayChieu() {
        return ngayChieu;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public void setHangSX(Bai36_hang_san_xuat hangSX) {
        this.hangSX = hangSX;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public void setNgayChieu(Bai36_ngay_chieu ngayChieu) {
        this.ngayChieu = ngayChieu;
    }
    public boolean kiemTraGiaVeHon(Bai36_bo_phim phimKhac)
    {
        return this.giaVe <phimKhac.giaVe;
    }
    public  String layTenHangSanXuat()
    {
        return  this.hangSX.getTenHSX();
    }
    public  double giaSauKM(double x)
    {
        return  this.giaVe*(1-x/100);
    }
}
