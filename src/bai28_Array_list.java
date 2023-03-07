import java.util.ArrayList;
import java.util.List;

public class bai28_Array_list {
    public static void main(String[] args) {
        // khai bao lis
        ArrayList<Integer> lst=new ArrayList<>();
        //khai bao voi so luong phan tu ban dau
        ArrayList<Integer> lst2=new ArrayList<>(5);
        //khoi tao list voi phan tu ban dau
        ArrayList<Integer> lst3=new ArrayList<>(List.of(1,2,3,4,5,6));
        //xuat list
        System.out.println(lst);
        System.out.println(lst2);
        System.out.println(lst3);

        // add them han tu
        ArrayList<Integer> lst4=new ArrayList<>(List.of(1,2,3,4));
        lst4.add(7);
        lst4.add(1,7);
        System.out.println(lst4);

        //so phan tu trong mang
        System.out.println("sophan tu:"+lst4.size());

        //get phan tu trong mang ra
        System.out.print("lay phan tu ra:");
        System.out.println(lst4.get(3));

        // xoa phan tu theo index
        lst4.remove(2);
        System.out.println("sau khi xao vi tri index 2");
        System.out.println(lst4);
        // xoa mot phan tu
        ArrayList<Integer> lst5=new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println("lst5:"+lst5);
        lst5.remove(Integer.valueOf(3));
        System.out.println("lst 5 sau xoa:"+lst5);

        ArrayList<Integer> lst6=new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println("lst6"+lst6);
        lst6.set(2,99);
        System.out.println("lst6 sau doi la:"+lst6);

    }
}
