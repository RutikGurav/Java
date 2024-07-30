class Student extends Person{
    int regno;
    char grade;
    public Student(String name, int age, int regno, char grade){
        super(name, age);
        this.regno = regno;
        this.grade = grade;
    }

    @Override
    public void showDetails(){
        super.showBasicDetails();
        System.out.println("Registration Number: " + regno);
        System.out.println("Grade: " + grade);
    }
}
