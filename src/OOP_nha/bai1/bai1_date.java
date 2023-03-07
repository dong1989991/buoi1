package OOP_nha.bai1;

public class bai1_date {
    private int ngay=4;
    private int thang;
    private  int nam;
    private int date;

    public bai1_date() {
    }

    public bai1_date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;


    }


    public int getNgay() {
        return ngay;
    }

    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }

    public int getDate() {
        return date;
    }
    public void printDay()
    {
        System.out.println("day:"+this.ngay);
    }
    public void printThang()
    {
        System.out.println("Thang:"+this.thang);
    }
    public void printNam()
    {
        System.out.println("nam:"+this.nam);
    }

}
