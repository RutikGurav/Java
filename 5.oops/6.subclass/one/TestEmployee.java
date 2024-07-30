

class TestEmployee {
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.setName("Rutik Gurav");
        manager.setEmail("rutikgurav15@gmail.com");
        manager.setDepartment("Software Development");

        System.out.println(manager.getDetails());
    }
}
