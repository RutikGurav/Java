class Name{
    public String firstName;
    public String middleName;
    public String lastName;

    public Name(String firstName, String middleName, String lastName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
}
class Employee{
    public int age;
    public Name name;

    public void show(int age,Name name){
        System.out.println("Age : "+age);
        System.out.println(name.firstName+" "+name.middleName+" "+name.lastName);
    }
}
class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Name name = new Name("Rutik", "Balavant", "Gurav");
        employee.show(23, name);
    }
}
