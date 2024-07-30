class EmployeeData {
    public int empNo;
    public String name;
    public static String companyName = "Tech-Mahindra";

    public EmployeeData(int empNo, String name) {
        this.empNo = empNo;
        this.name = name;
    }

    public void displayDetails(){
        companyName = "Accenture";
        System.out.println("Emp No: " + this.empNo+"\n"+"Employee Name : "+this.name+"\n"+"Company Name : "+companyName);
    }
        public static void main(String[] args) {
            EmployeeData data = new EmployeeData(2024,"Rutik Gurav");
            data.displayDetails();
        }
}
