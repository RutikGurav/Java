class Example {
    // instance variable or Fields
    String name="";
    int age;
    int marks;

    // constructor
    Example(String Name, int Age, int Marks) {
        name = Name;
        age = Age;
        marks = Marks;
    }
    // method
    public void show(){
        System.out.println("Student details:\n"+name+" "+age+" "+marks);
    }
    public static void main(String[] args) {
         System.out.println("We are created three instance variable, constructor and one method!!");
         //creating instance/reference of class
         Example example = new Example("Rutik Gurav", 22, 80);
         System.out.println(example);
         //calling method
         example.show();
    }
}
