class Demo {
    public static void main(String[] args) {
        StudentEnroll s1 = new StudentEnroll("01","Rutik Gurav","IT");
        StudentEnroll s2 = new StudentEnroll("02","Pratik Gurav","CS");
        StudentEnroll s3 = new StudentEnroll("03","Rohan Gurav","EEE");
        StudentEnroll.showOrgData();
        StudentEnroll.setOrgName("KIT",s1);
        s1.getDetails();
        s2.getDetails();
        s3.getDetails();
        StudentEnroll.showOrgData();
    }
}
