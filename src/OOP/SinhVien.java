package OOP;

public class SinhVien {
    private  String hoTen;
    private  double diem;

    // contructor khong co doi so
    public SinhVien() {
        hoTen="no name";
        diem=0.0;
    }
// contructor co doi so

    public SinhVien(String hoTen) {
        this.hoTen = hoTen;
    }

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public void hienThiThongTin()
    {
        System.out.println(hoTen+" : "+diem);
    }
    public double tinhDTB(double diemToan,double diemVan)
    {
        return (diemToan+diemVan)/2;
    }

    //get va set

    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    //toString

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                '}';
    }
    private boolean checkDiem()
    {
        return this.diem>=24;
    }
    public  void checkHopLeDiem()
    {
        if(checkDiem())
            System.out.println("diem hop le.");
        else
            System.out.println("kiem tra lai diem dau vao cua sinh vien");
    }
}
