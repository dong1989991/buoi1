package OOP_nha.bai1;

public class bai31_hoaDonCaPhe {
    private String tenLoaiCaphe;
    private  double giaTien1Kg;
    private double khoiLuong;

    public bai31_hoaDonCaPhe() {
    }

    public bai31_hoaDonCaPhe(String tenLoaiCaphe, double giaTien1Kg, double khoiLuong) {
        this.tenLoaiCaphe = tenLoaiCaphe;
        this.giaTien1Kg = giaTien1Kg;
        this.khoiLuong = khoiLuong;
    }
    public double tinhTongTien()
    {
        return this.giaTien1Kg*this.khoiLuong;
    }
    public boolean kiemTraKhoiLuong(double kl)
    {
        return this.khoiLuong>kl;
    }
    public boolean kiemTraTongTien()
    {
        return this.tinhTongTien()>500;
    }
    public double giamGia(double x)
    {
        if(this.tinhTongTien()>500)
        return (x/100)*this.tinhTongTien();
        else return  0;
    }
    public double giaSauGiam(double x)
    {
        return this.tinhTongTien()-this.giamGia(x);
    }

}
