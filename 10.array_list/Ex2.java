import java.util.ArrayList;

class Ex2 {
    public static void main(String[] args) {
        int num = 5;
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        System.out.println("Arr1 : "+arr1);
        System.out.println("Arr2 : "+arr2);
        
        for(int i=1;i<=num;i++){
            arr1.add(i);
            arr2.add(i);
        }

        System.out.println("Arr1 : "+arr1);
        System.out.println("Arr2 : "+arr2);
    }
}
