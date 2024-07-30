class Employee {
    private static final String name;
    private String email_id;

    static{
        name="Rutik Gurav";
    }

    public Employee(){
        email_id = "rutikgurav@gmail.com";
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

    // public fianl String getDetails(){ // final method can't be override it
    public String getDetails(){
        return ("Name: "+getName()+"\nEmail: "+getEmail());
    }
}
