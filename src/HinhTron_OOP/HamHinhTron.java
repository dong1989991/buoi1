package HinhTron_OOP;

public class HamHinhTron {
    double banKinh;

    public HamHinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public String toString() {
        return "HamHinhTron{" +
                "banKinh=" + banKinh +
                '}';
    }
    public double tinhChuVi()
    {
        return banKinh*2*Math.PI;
    }
    public  double tinhDienTich()
    {
        return banKinh*banKinh*Math.PI;
    }
}
