class Employee {
    private String empName="";
    private String empEmail;

    public Employee(String empName, String empEmail){
        this.empName = empName;
        this.empEmail = empEmail;
    }

    // public void setEmpName(String empName){
    //     this.empName = empName;
    // }
    public String getEmpName(){
        return empName;
    }
    // public void setEmpEmail(String empEmail){
    //     this.empEmail = empEmail;
    // }
    public String getEmpEmail(){
        return empEmail;
    }

    public String getDetails(){
        return ("Name: "+getEmpName()+"\nEmail: "+getEmpEmail());
    }
}
