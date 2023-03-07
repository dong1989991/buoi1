import java.util.Scanner;

public class mat_ma_string {
    public static void main(String[] args) {
        String a="abcdefghijklmnopqrstuvwxyz";
        String b="zxcvbnmasdfghjklqwertyuiop";
        Scanner khoiTao=new Scanner(System.in);
        System.out.println("moi nhap gia tri can ma hoa:");

        String input= khoiTao.nextLine();
        String output="";
        for(int i=0;i<input.length();i++)
        {
            char c=input.charAt(i);// tim ra ky tu tai vi tri 0 cua input
            int index=a.indexOf(c);//index se bnag vi tri cua ky tu c trong chuoi a
            if(index==-1)
                output+=c;
            else {
                output+=b.charAt(index);// output se bang ky tu cua vi tri tai index
            }
        }
        System.out.println("sin nhan sau ma hoa la:"+output);
    }
}
