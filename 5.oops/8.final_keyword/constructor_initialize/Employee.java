class Employee {
    private final String name="Rutik Gurav";
    private final String email_id;

    public Employee(){
        email_id = "rutik@gmail.com";
    }

    // public void setName(String newName){
    //     name = newName;
    // }
    public String getName(){
        return name;
    }
    // public void setEmail(String newEmail){
    //     email_id = newEmail;
    // }
    public String getEmail(){
        return email_id;
    }
    public String getDetails(){
        return ("Name: "+getName()+"\nEmail: "+getEmail());
    }
}
