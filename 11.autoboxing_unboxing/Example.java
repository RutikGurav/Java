
import java.util.ArrayList;

class Example {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=10;i++){
            list.add(i);
        }

        for(int i=0;i<10;i++){
            System.out.println(i+" is "+list.get(i));
        }

        // ArrayList<Double> arr2 = new ArrayList<>();

        // for(double i=0.0;i<10.0;i=+0.5){
        //     arr2.add(i);
        // }

        // for(int i=0;i<arr2.size();i++){
        //     System.out.println(i+" is "+arr2.get(i));
        // }

        
    }
}
