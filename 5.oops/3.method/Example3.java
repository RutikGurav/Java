class Example3 {
    public static int displayDetails(){
        System.out.println("Hello World!");
        square(11);
        return 8;
    }
    public static void square(int num){
        System.out.println(num*num);
    }
    public static void main(String[] args) {
        Example1 ex = new Example1();
        System.out.println(displayDetails());
        
    }
}
