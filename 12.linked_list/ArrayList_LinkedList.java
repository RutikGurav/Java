
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ArrayList_LinkedList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        List<String> list1 = new LinkedList<>();
        list1.add("One");
        list1.add("Two");
        list1.add("Three");


        System.out.println(list);
        System.out.println(list1);


    }
}
