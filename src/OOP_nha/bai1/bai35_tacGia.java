package OOP_nha.bai1;

public class bai35_tacGia {
    private String tenTacGia;
    private Bai35_ngay ngaySinh;

    public bai35_tacGia() {
    }

    public bai35_tacGia(String tenTacGia, Bai35_ngay ngaySinh) {
        this.tenTacGia = tenTacGia;
        this.ngaySinh = ngaySinh;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public Bai35_ngay getNgaySinh() {
        return ngaySinh;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public void setNgaySinh(Bai35_ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}
