class TestEmployee {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("Rutik Gurav");
        manager.setEmail_id("rutikgurav15@gmail.com");
        manager.setDepartment("Account Manager");
        System.out.println(manager.getDetails());
    }
}
