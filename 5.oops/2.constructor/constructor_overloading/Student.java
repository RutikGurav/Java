class Student {
    int id;
    String name;
    double marks;

    Student(){
        System.out.println("I am a default constructor!!");
    }

    Student(int Id){
        System.out.println("I am a constructor with single parameter!!");
        id = Id;
    }
    Student(int Id, String Name){
        System.out.println("I am a constructor with two parameter!!");
        id = Id;
        name = Name;
    }
    Student(String Name, int Id){
        System.out.println("I am a constructor with two parameter!!");
        id = Id;
        name = Name;
    }
    Student(int Id, String Name, double Marks){
        System.out.println("I am a constructor with three parameter!!");
        id = Id;
        name = Name;
        marks = Marks;
    }

    public void showDetails(){

        System.out.println("Show details method is called..!!");
        System.out.println(id);
        System.out.println(name);
        System.out.println(marks);
    }
    public static void main(String[] args) {
        System.out.println("Main method is called..!!");
        Student stu = new Student();
        stu.showDetails();

        Student stu1 = new Student(101);
        stu1.showDetails();

        Student stu2 = new Student(23,"Pratik");
        stu2.showDetails();

        Student stu4 = new Student("Omkar",18);
        stu4.showDetails();

        Student stu3 = new Student(18,"Rutik",80);
        stu3.showDetails();

        
    }
}
