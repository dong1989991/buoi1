package OOP_nha.bai1;

public class bai32_main {
    public static void main(String[] args) {
        bai32_get_set md=new bai32_get_set(31,1,2022);
        System.out.println("day:"+md.getDay());
        md.setDay(35);
        System.out.println("day:"+md.getDay());
        bai32_get_set md1=new bai32_get_set(30,11,2021);
        bai32_get_set md2=new bai32_get_set(30,11,2021);
        System.out.println(md);
        System.out.println(md1);
        System.out.println(md2);
        System.out.println("so sanh:"+ md1.equals(md2));
        System.out.println("so sanh:"+ md.equals(md2));
        System.out.println("HashCode:"+ md.hashCode());



    }
}
