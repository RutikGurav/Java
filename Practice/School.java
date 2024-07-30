class School {
    private String name;
    private String rollNo;
    private String standard;
    private String section;

    public School(){
        this("DName", "DRollNo", "V", "A");
    }
    public School(String name,String rollNo){
        this(name,rollNo,"Pratik","B");
    }
    public School(String name,String rollNo,String standard,String section){
        this.name = name;
        this.rollNo = rollNo;
        this.standard = standard;
        this.section = section;
    }

    public String getName(){
        return this.name;
    }
    public String getRollNo(){
        return this.rollNo;
    }
    public String getStandard(){
        return this.standard;
    }
    public String getSection(){
        return this.section;
    }

    public static void main(String[] args) {
        School student1 = new School();
        System.out.println(student1.getName()+" "+student1.getRollNo()+" "+student1.getStandard()+" "+student1.getSection());
        
        School student2 = new School("Rohan","23");
        System.out.println(student2.getName()+" "+student2.getRollNo()+" "+student2.getStandard()+" "+student2.getSection());
        
        School student3 = new School("Digu","12","XI","C");
        System.out.println(student3.getName()+" "+student3.getRollNo()+" "+student3.getStandard()+" "+student3.getSection());
        
    }
}
