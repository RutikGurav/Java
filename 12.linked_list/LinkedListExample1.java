
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

class LinkedListExample1 {
    public static void main(String[] args) {
        LinkedList<String> alphabet = new LinkedList<>();
        addInAscOrd(alphabet, "Rutik");
        addInAscOrd(alphabet, "Pratik");
        addInAscOrd(alphabet, "Rohan");
        addInAscOrd(alphabet, "Digu");
        addInAscOrd(alphabet, "Vikas");
        prinList(alphabet);

        addInAscOrd(alphabet, "Zendu");
        prinList(alphabet);

        addInAscOrd(alphabet, "Rohan");
        prinList(alphabet);

        addInAscOrd(alphabet, "Omkar");
        prinList(alphabet);


    }
    public static boolean addInAscOrd(LinkedList<String> str, String newWord){
        ListIterator<String> it = str.listIterator();
        while(it.hasNext()){
            int compare = it.next().compareTo(newWord);
            if(compare == 0){
                System.out.println("Word is already exist.");
                return false;
            }else if(compare>0){
                it.previous();
                it.add(newWord);
                return true;
            }
            
        }
        it.add(newWord);
        return true;
    }
    public static void prinList(LinkedList<String> strList){
        Iterator<String> it = strList.iterator();
        while(it.hasNext()){
            System.out.println("Printing : "+it.next());
        }
        System.out.println("--------------------------------");
    }
}
