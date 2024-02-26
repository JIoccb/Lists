import java.util.ArrayList;
import java.util.List;

public class Lists {
    private final List<Object> list1;
    private final List<Object> list2;
    public Lists(List<Object> list1, List<Object> list2){
        this.list1 = list1;
        this.list2 = list2;
    }
    public List<Object> getList1(){
        return list1;
    }
    public List<Object> getList2(){
        return list2;
    }
    public List<Object> generalList(){
        List<Object> list1 = this.list1;
        List<Object> list2 = this.list2;
        List<Object> general = new ArrayList<>();
        for (Object element : list1){
            if (list2.contains(element)){
                general.add(element);
            }
        }
        return general;
    }
}
