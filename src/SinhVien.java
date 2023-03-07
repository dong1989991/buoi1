public class SinhVien {
    private String hoTen;
    private double diem;

/*    public SinhVien()
    {
        hoTen="no name";
        diem=30;
    }*/

    public SinhVien() {
        hoTen="no name";
        diem=30;
    }

    public void hienThiThongTin()
    {
        System.out.println(hoTen+" : "+diem);
    }
}
