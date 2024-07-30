class Example1 {
    int roll_no;
    String name;
    
    //default constructor is called

    public void displayDetails(){
        System.out.println(roll_no);
        System.out.println(name);
    }
    public static void main(String[] args) {
        Example1 example1 = new Example1();
        
        example1.displayDetails();
    }
}
