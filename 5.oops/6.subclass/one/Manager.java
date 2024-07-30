class Manager extends Employee {
    private String department="";

    public void setDepartment(String newDepartment) {
        department = newDepartment;
    }
    public String getDepartment(){
        return department;
    }
    
    @Override
    public String getDetails(){
        return ("Name: "+getName()+"\nEmail: "+getEmail()+"\nDepartment: "+getDepartment());
    }
}
