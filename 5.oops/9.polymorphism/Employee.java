class Employee {
    private String name="";
    private String email;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getDetails(){
        return ("Name: " + getName() + "\nEmail: " + getEmail());
    }
}
