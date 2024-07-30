class StudentEnroll{
    private String id,name,branch;
    public static int count=0;
    public static String org_name = "DYPCET";

    public StudentEnroll(String id, String name, String branch){
        this.id = id;
        this.name = name;
        this.branch = branch;
        count++;
    }
    public void showData(){
        System.out.println(id+" "+name+" "+branch+" "+count+" "+org_name);
    }

    public static void setOrg(String org){
        org_name = org;
    }

    public static void showOrg(){
        System.out.println("Org Name : "+org_name+" Count : "+count);
    }

    public static void main(String[] args) {
        StudentEnroll s = new StudentEnroll("01","Rutik","ETC");
        StudentEnroll s1 = new StudentEnroll("02","Pratik","ME");
        StudentEnroll s2 = new StudentEnroll("03","Rohan","CS");
        s.showData();
        s1.showData();
        s2.showData();
        StudentEnroll.showOrg();

        StudentEnroll s3 = new StudentEnroll("04","Digu","IT");
        StudentEnroll.setOrg("KIT");
        
        s3.showData();
        StudentEnroll.showOrg();
    }
}