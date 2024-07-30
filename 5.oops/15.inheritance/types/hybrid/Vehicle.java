class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void drive(){
        System.out.println(name+" is driving");
    }
}
