class EncapsulationExample {
    private String name;
    private int age;

    public EncapsulationExample(String name, int age){
        this.name = name;
        if(age>0){
            this.age = age;
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        EncapsulationExample person = new EncapsulationExample("Rutik", -23);//not consider age<0

        System.out.println("Name : "+person.getName());
        System.out.println("Age : "+person.getAge());

        person.setName("Pratik");
        person.setAge(16);

        System.out.println("Updated Name : "+person.getName());
        System.out.println("Updated Age : "+person.getAge());
    }
}
