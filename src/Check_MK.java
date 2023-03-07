import java.util.Scanner;

public class Check_MK {
    public static void main(String[] args) {
        Scanner khoiTao=new Scanner(System.in);
        String passwork ="";
        while(true)
        {
            System.out.println(" nhap MK");
            System.out.println("mat khau bao gom 6 ky tu, 1 chu cai, 1 so:");
            String newPasswork =khoiTao.nextLine();
            if(checkMK(newPasswork))
            {
                passwork=newPasswork;
                System.out.println("mk ,moi da duoc thiet lap");
                break;
            }
            else System.out.println(" mk khong hop le, xin vui long nhap lai");
        }
            int cout=0;
        String login="";
        while(true)
        {
            System.out.println("moi nhap mk login");
            login=khoiTao.nextLine();
            if(login.equals(passwork))
            {
                System.out.println("dang nhap thanh cong");
                break;
            }
            else
            {
                System.out.println("MK khong dung vui long dang nhap lai");
                cout++;
            }
            if(cout==5){
                System.out.println(" nhap sai qua 5 lan ");
                break;
            }
        }
    }
    public static boolean checkMK(String passwork) {
        if (passwork.length() < 6)
            return false;

        boolean hasLetter = false;
        for (char c : passwork.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
                break;
            }

        }
        if (hasLetter == false)
            return false;

        boolean hasNumber = false;
        for (char c : passwork.toCharArray()) {
            if (Character.isDigit(c)) {
                hasNumber = true;
                break;
            }

        }
        if (hasNumber == false)
            return false;
return true;
    }

}
