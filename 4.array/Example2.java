class Example2 {
    public static void main(String[] args) {
        int arr[] = new int[11];

        for(int i=0;i<arr.length;i++){
            arr[i] = i*5;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println("The element at index "+i+ " is : "+arr[i]);
        }
    }
}
