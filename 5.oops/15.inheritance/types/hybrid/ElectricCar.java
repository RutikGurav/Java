class ElectricCar extends Car implements ElectricVehicle, PetrolVehicle{

    public ElectricCar(String name){
        super(name);
    }

    @Override
    public void charge(){
        System.out.println(name+" is charging");
    }

    @Override
    public void refuel(){
        System.out.println(name+" is refueling");
    }
}
