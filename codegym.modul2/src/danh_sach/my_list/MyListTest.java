package danh_sach.my_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.remove(1);
        for (int i=0;i<listInteger.getSize();i++){
            System.out.println(listInteger.get(i));
        }
    }
}
