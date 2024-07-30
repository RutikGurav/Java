class Vehicle{
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }
    public void drive(){
        System.out.println(name+" is drawing");
    }
}
class Car extends Vehicle{
    public Car(String name){
        super(name);
    }
    public void honk(){
        System.out.println(name+" is honking");
    }
}
class Bike extends Vehicle{
    public Bike(String name){
        super(name);
    }
    public void rev(){
        System.out.println(name+" is revving");
    }
}
interface ElectricVehicle{
    abstract void charge();
}
interface PetrolVehicle{
    abstract void refuel();
}
class ElectricCar extends Car implements ElectricVehicle,PetrolVehicle{
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

class Result {
    public static void main(String[] args) {
        Car car = new Car("BMW");
        car.drive();
        car.honk();

        Bike bike = new Bike("Hero");
        bike.drive();
        bike.rev();

        ElectricCar electricCar = new ElectricCar("Tesla");
        electricCar.drive();
        electricCar.honk();
        electricCar.charge();
        electricCar.refuel();
    }
}
