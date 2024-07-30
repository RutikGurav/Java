import java.util.ArrayList;
import java.util.Iterator;
class Ex1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Rutik");
        list.add("Pratik");
        list.add("Rohan");
        list.add("Digambar");

        // String newString = list.get(0);

        // list.remove(0);
        // list.remove("Rohan");

        // System.out.println(list);
        // System.out.println(newString);

        //using for-loop
        // for(int i=0;i<list.size();i++){
        //     System.out.println(list.get(i));
        // }

        //using for-each
        // for(String s: list){
        //     System.out.println(s);
        // }

        //using iterator
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
