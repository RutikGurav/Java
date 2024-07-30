class Demo{
    public static void main(String[] args) {
        StudentEnroll s1 = new StudentEnroll("01", "Rutik", "ETC");
        StudentEnroll s2 = new StudentEnroll("02", "Pratik", "CS");
        StudentEnroll s3 = new StudentEnroll("03", "Omkar", "ME");
        s1.getDetails();
        s2.getDetails();
        s3.getDetails();
        System.out.println();
        StudentEnroll.showOrgData();

        System.out.println();
        
        StudentEnroll s4 = new StudentEnroll("04", "Pratik", "CS");
        StudentEnroll s5 = new StudentEnroll("05", "Omkar", "ME");
        StudentEnroll.setOrgName("KIT");
        // s1.getDetails();
        // s2.getDetails();
        // s3.getDetails();
        s4.getDetails();
        s5.getDetails();
        System.out.println();
        StudentEnroll.showOrgData();
    }
}