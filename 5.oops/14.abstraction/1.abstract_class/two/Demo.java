class Demo {
    public static void main(String[] args) {
        Person p1 = new Employee("Rutik Gurav",23,"EN20147686",25000);
        // p1.showBasicDetails();
        p1.showDetails();
        System.out.println();
        Person p2 = new Student("Pratik Gurav",18,2048,'A');
        // p2.showBasicDetails();
        p2.showDetails();
    }
}
