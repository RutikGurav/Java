class TestEmployee {
    public static void main(String[] args) {
        Manager manager = new Manager("Rutik Gurav","rutikgurav15@gmail.com","Software Development");
        // manager.setEmpName("Rutik Gurav");
        // manager.setEmpEmail("rutikgurav15@gmail.com");
        // manager.setEmpDepartment("Software Development");
        System.out.println(manager.getDetails());
    }
}
