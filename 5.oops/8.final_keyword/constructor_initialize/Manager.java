class Manager extends Employee {
    private final String department="AI-ML";

    // public void setDepartment(String newDepartment) {
    //     department = newDepartment;
    // }
    
    public String getDepartment(){
        return department;
    }
    
    @Override
    public String getDetails(){
        return ("Name: "+getName()+"\nEmail: "+getEmail()+"\nDepartment: "+getDepartment());
    }
}
