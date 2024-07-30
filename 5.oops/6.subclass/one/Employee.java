class Employee {
    private String name="";
    private String email_id;

    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String newEmail){
        email_id = newEmail;
    }
    public String getEmail(){
        return email_id;
    }
    public String getDetails(){
        return ("Name: "+getName()+"\nEmail: "+getEmail());
    }
}
