class Name{
    public String fName;
    public String mName;
    public String lName;

    public Name(String fName, String mName, String lName){
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
    }
}
class Employee{
    public int age;
    public Name name;

    public void display(int age,Name name){
        System.out.println(age+" "+name.fName + " " + name.mName + " " + name.lName);
    }
}
class Ex1{
    public static void main(String[] args) {
        Employee emp = new Employee();
        Name name = new Name("Rutik","Balavant","Gurav");
        emp.display(23,name);
        Name name1 = new Name("Pratik","Balavant","Gurav");
        emp.display(16,name1);
    }
}