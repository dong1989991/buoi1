package OOP_nha.bai1;

public class Bai35_sach {
    private String tenSach;
    private double giaBan;
    private int namXuatBan;
    private bai35_tacGia tacGia;

    public Bai35_sach() {
    }

    public Bai35_sach(String tenSach, double giaBan, int namXuatBan, bai35_tacGia tacGia) {
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public bai35_tacGia getTacGia() {
        return tacGia;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public void setTacGia(bai35_tacGia tacGia) {
        this.tacGia = tacGia;
    }
    public void inTenSach()
    {
        System.out.println(this.tenSach);
    }
    public  boolean kiemTraCungNamXuatBan(Bai35_sach sachKhac)
    {
//       if(this.namXuatBan==sachKhac.namXuatBan )
//           return true;
//       else
//           return false;
        return this.namXuatBan == sachKhac.namXuatBan;
    }
    public double giaSauKhiGiam(double x)
    {
        return  this.giaBan*(1-x/100);
    }
}
