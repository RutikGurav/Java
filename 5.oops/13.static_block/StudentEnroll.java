class StudentEnroll {
    private String id,name,branch;
    public static int count;
    public static String org_name;

    {
        count=50;
        org_name="DYP Engineering College";
        System.out.println("Instance Block executed");
    }
    
    public StudentEnroll(String id, String name, String branch) {
        System.out.println("Constructor is invoked");
        this.id = id;
        this.name = name;
        this.branch = branch;
        count++;
    }

    public void showData(){
        System.out.println("Method is invoked");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Organization Name: " + org_name);
        System.out.println("Total Students Enrolled: " + count);
    }

    static{
        count=100;
        org_name="DYP University";
        System.out.println("Static Block-1 executed");
    }

    static{
        count=150;
        org_name="KIT University";
        System.out.println("Static Block-2 executed");
    }

    static{
        count=200;
        org_name="Shivaji University";
        System.out.println("Static Block-3 executed");
    }
}
