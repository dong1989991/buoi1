package OOP;

public class Bai30_oot_buoi1 {
    public static void main(String[] args) {
        SinhVien sv1=new SinhVien();
        SinhVien sv2=new SinhVien();
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        SinhVien sv3=new SinhVien("dong");
        sv3.hienThiThongTin();

        SinhVien sv4=new SinhVien("dong doan",9.5);
        sv4.hienThiThongTin();
        System.out.println(sv4.getHoTen());
        System.out.println(sv4.getDiem());

        sv4.setHoTen("balck");
        sv4.hienThiThongTin();

        double dtbsv4=sv4.tinhDTB(8.2,2.8);
        System.out.println(dtbsv4);

        // phuon gthuc toString
        System.out.println(sv4);

        //support mothed
        sv4.checkHopLeDiem();
    }
}
