class Example4 {
    public void show(){
        System.out.println("Hello Rutik!");
    }
}

class Example3 {
    public static int displayDetails(){
        System.out.println("Hello World!");
        square(11);
        return 8;
    }

    public static void square(int num){
        System.out.println(num * num);
    }

    public static void main(String[] args) {
        Example3 a = new Example3();
        System.out.println(displayDetails());

        Example4 b = new Example4();
        b.show();
    }
}
