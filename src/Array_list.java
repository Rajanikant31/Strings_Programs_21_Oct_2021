import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Array_list {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(6);
        list.add(6);
        list.add(5);
        Set<Integer> set = new LinkedHashSet<Integer>(list);
        System.out.println(set);
    }
}