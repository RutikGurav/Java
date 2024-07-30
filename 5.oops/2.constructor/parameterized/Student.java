class Student {
    int id;
    String name;

    Student(){
        System.out.println("I am default constructor");
        id = 0;
        name = null;
    }

    Student(int Id,String Name){
        System.out.println("I am parameterized constructor");
        id = Id;
        name = Name;
    }

    public void show(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.show();
        Student s2 = new Student(1,"Rutik");
        s2.show();
    }
}
