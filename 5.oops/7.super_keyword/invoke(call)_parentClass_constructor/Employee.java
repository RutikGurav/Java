class Employee {
    private String name="";
    private String email_id;

    public Employee(String name, String email_id) {
        this.name = name;
        this.email_id = email_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getEmail_id() {
        return email_id;
    }

    public String getDetails(){
        return ("Name: " + getName() + "\nEmail: " + getEmail_id());
    }

}
