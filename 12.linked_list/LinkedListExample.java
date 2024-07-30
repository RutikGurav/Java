import java.util.*;

class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> fruit = new LinkedList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.addFirst("Grapes");
        fruit.addLast("Mango");
        fruit.add("Papaya");
        fruit.add(3,"Nimbu");

        System.out.println(fruit.remove(5));
        
        printList(fruit);

        // System.out.println(fruit);

        // Iterator<String> i = fruit.iterator();
        // while(i.hasNext()){
        //     System.out.println(i.next());
        // }
    }
    public static void printList(LinkedList<String> linkedlist){
        System.out.println("-------------------");

        Iterator<String> i = linkedlist.iterator();
        while(i.hasNext()){
            System.out.println("Printing : "+i.next());
        }
        System.out.println("-------------------");
    }
}
