class School {
    private String name;
    private String rollNo;
    private String standard;
    private String section;

    public School(){
        this("Dname","DrollNo","X","D");
    }
    public School(String name, String rollNo){
        this(name,rollNo,"XI","B");
    }
    public School(String name, String rollNo, String standard, String section){
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
        School s = new School();
        System.out.println(s.getName()+" "+s.getRollNo()+" "+s.getStandard()+" "+s.getSection());
        
        School s2 = new School("Pratik", "22");
        System.out.println(s2.getName()+" "+s2.getRollNo()+" "+s2.getStandard()+" "+s2.getSection());


        School s1 = new School("Rutik", "23", "XII", "A");
        System.out.println(s1.getName()+" "+s1.getRollNo()+" "+s1.getStandard()+" "+s1.getSection());

    }
}
