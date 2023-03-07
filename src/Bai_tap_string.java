import java.util.Scanner;

public class Bai_tap_string {
    public static void main(String[] args) {
        // nhap mot chuoi tu ban phim
        // dem in hoa, in thuong, so, khoang trang
        Scanner khoiTao= new Scanner(System.in);
        System.out.println("moi nhap chuoi");
        String s=khoiTao.nextLine();
        int demSo=0;
        int demThuong=0;
        int demTrang=0;
        int demHoa=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isLowerCase(c))
                demThuong++;
            else if (Character.isUpperCase(c))
                demHoa++;
            else if (Character.isDigit(c))
                demSo++;
                else if (Character.isWhitespace(c))
                    demTrang++;
                
            }
        System.out.println("SO:"+demSo);
        System.out.println("Thuong:"+demThuong);
        System.out.println("trang:"+demTrang);
        System.out.println("Hoa:"+demHoa);
        }





}
