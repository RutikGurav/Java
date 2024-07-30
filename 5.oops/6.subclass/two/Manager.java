class Manager extends Employee{
    private String department = "ETC";

    // public void setDepartment(String department) {
    //     this.department = department;
    // }

    public String getDepartment() {
        return department;
    }

    @Override
    public String getDetails(){
        return (super.getDetails() + "\nDepartment: " + getDepartment());
    }

}
