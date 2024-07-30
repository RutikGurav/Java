class Student {
    public String firstName;
    public String middleName;
    public String lastName;

    public Student(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
}


class Employee{
    public int age;
    public Student student;

    public void showData(int age, Student student){
        System.out.println("Age : "+age);
        System.out.println(student.firstName+" "+student.middleName+" "+student.lastName);
    }
}


class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Student student = new Student("Rutik","Balavant","Gurav");
        emp.showData(23,student);
        
    }
}
