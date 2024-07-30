class Ex2 {
    public static void main(String[] args) {
        int arr[] = {12,24,4,68,5,2};

        System.out.println(arr[4]);

        arr[4] = 100;

        System.out.println(arr[4]);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

