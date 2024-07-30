class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Rutik Gurav");
        emp.setEmail("rutikgurav2021@gmail.com");

        Employee emp1 = new Manager();
        emp1.setName("Pratik Gurav");
        emp1.setEmail("pratikgurav15@gmail.com");

        Manager emp2 = new Manager();
        emp2.setName("Pratik Gurav");
        emp2.setEmail("pratikgurav15@gmail.com");
        emp2.setDepartment("Account Manager");


        System.out.println("Details of Employee : \n"+emp.getDetails());
        System.out.println();
        System.out.println("Details of Manager : \n"+emp1.getDetails());
        System.out.println();
        System.out.println("Details of Manager : \n"+emp2.getDetails());
    }
}
