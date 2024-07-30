class Employee extends Person{
    String empid;
    int salary;
    public Employee(String name, int age,String empid, int salary) {
        super(name, age);
        this.empid = empid;
        this.salary = salary;
    }

    @Override
    public void showDetails(){
        System.out.println("Employee ID: " + empid);
        System.out.println("Salary: " + salary);
    }

}
