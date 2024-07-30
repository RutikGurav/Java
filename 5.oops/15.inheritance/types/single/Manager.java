class Manager extends Employee{
    private String empDepartment="";

    public Manager(String empName, String empEmail, String empDepartment){
        super(empName, empEmail);
        this.empDepartment=empDepartment;
    }

    // public void setEmpDepartment(String empDepartment){
    //     this.empDepartment=empDepartment;
    // }
    public String getEmpDepartment(){
        return empDepartment;
    }

    @Override
    public String getDetails(){
        return (super.getDetails()+"\nDepartment: "+getEmpDepartment());
        // return ("Name: "+getEmpName()+"\nEmail: "+getEmpEmail()+"\nDepartment: "+getEmpDepartment());
    }
}
