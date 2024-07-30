class Bike extends Vehicle{
    public Bike(String name){
        super(name);
    }

    public void rev(){
        System.out.println(name+" is revving");
    }
}
