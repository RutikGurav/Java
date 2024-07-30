import java.util.Arrays;

class Example1 {
    public static void main(String[] args) {
        int arr[] = new int[7];
        arr[0] = 1;
        arr[1] = 2;
        arr[6] = 20;
        int arr1[] =  arr;
        arr1[3] = 40;
        System.out.println(Arrays.toString(arr));//here 40 store in index 3 because same memory location
        System.out.println(Arrays.toString(arr1));
    }
}
/*
[1, 2, 0, 40, 0, 0, 20]
[1, 2, 0, 40, 0, 0, 20] 
*/