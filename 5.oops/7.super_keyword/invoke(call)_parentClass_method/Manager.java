class Manager extends Employee{
    private String department = "";

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String getDetails(){
        // calling the method in parent class and adding the department details to it.
        //invoke the parent class method using super keyword
        return (super.getDetails() + "\nDepartment: " + getDepartment());
    }

}
