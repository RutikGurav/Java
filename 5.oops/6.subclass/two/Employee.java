class Employee {
    private String name="";
    private String email_id;
    
    public Employee() {
        name = "Rutik Gurav";
        email_id = "rutikgurav2021@gmail.com";
    }

    // public void setName(String name) {
    //     this.name = name;
    // }

    public String getName() {
        return name;
    }

    // public void setEmail_id(String email_id) {
    //     this.email_id = email_id;
    // }

    public String getEmail_id() {
        return email_id;
    }

    public String getDetails(){
        return ("Name: " + getName() + "\nEmail: " + getEmail_id());
    }

}
