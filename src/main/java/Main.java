import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> mylist1 = new ArrayList<>();
        List<Object> mylist2 = new ArrayList<>();
        mylist1.add("Hello");
        mylist1.add("Universe");
        mylist2.add("Hello");
        mylist2.add("World");
        Lists mylist = new Lists(mylist1, mylist2);
        System.out.println(mylist.getList1());
        System.out.println(mylist.getList2());
        System.out.println(mylist.generalList());
    }
}
