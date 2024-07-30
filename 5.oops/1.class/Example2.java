class Example2 {
    private String name;
    private int age;
    public static void main(String[] args) {
        Example2 ex = new Example2();
        ex.name = "Rutik Gurav";
        ex.age = 22;

        Example2 ex1 = new Example2();
        ex1.name = "Pratik Gurav";
        ex1.age = 16;

        System.out.print(ex.name);
        System.out.println(ex.age);
        System.out.print(ex1.name);
        System.out.println(ex1.age);

    }
}
