class Example2 {
    int roll_no;
    String name;
    
    Example2(){
        roll_no = 23;
        name = "Rutik Gurav";
    }

    public void displayDetails(){
        System.out.println(roll_no);
        System.out.println(name);
    }
    public static void main(String[] args) {
        Example2 ex1 = new Example2();
        
        ex1.displayDetails();
    }
}
