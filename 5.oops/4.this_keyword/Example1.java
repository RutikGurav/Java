class Example1 {
    int age;
    String name;

    Example1(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public static void main(String[] args) {
        Example1 obj = new Example1(20, "Rutik");
        System.out.println(obj.age);
        System.out.println(obj.name);
    }
}
