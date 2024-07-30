class Student {
    int id;
    String name;

    {
        System.out.println("I am Non-static block");
    }

    Student(){
        System.out.println("I am default constructor");
        id = 0;
        name = null;
    }

    Student(int Id,String Name){
        System.out.println("I am parameterized constructor");

    }

    public void show(){
        System.out.println("Show method is called..");
    }
    public static void main(String[] args) {
        System.out.println("Main method is called..");
        Student s1 = new Student();
        Student s2 = new Student(1,"Rutik");
        s2.show();
    }
}
