import java.util.ArrayList;

class Ex3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(90);
        list.add(11);
        list.add(71);
        list.add(51);
        list.add(58);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
