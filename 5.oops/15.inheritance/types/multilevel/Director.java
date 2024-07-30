class Director extends Manager{
    private double budget;

    public Director(int id,String name,double salary,String department,double budget){
        super(id,name,salary,department);
        this.budget = budget;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Budget : "+budget);
    }
}
