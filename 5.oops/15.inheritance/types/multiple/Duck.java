class Duck implements CanFly, CanSwim{
    private String name;
    private int age;

    public Duck(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void fly(){
        System.out.println(name+" is flying at speed "+flySpeed);
    }

    @Override
    public void swim(){
        System.out.println(name+" is swim at speed "+swimSpeed);
    }

    public void displayDetails(){
        System.out.println("Name : "+name+"\nAge : "+age);
    }
}
