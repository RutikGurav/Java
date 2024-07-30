class Main {
    public static void main(String[] args) {
        Car car = new Car("RangeRover");
        car.drive();
        car.honk();

        Bike bike = new Bike("Bullet");
        bike.drive();
        bike.rev();

        ElectricCar electriccar = new ElectricCar("Tesla");
        electriccar.drive();
        electriccar.honk();
        electriccar.charge();
        electriccar.refuel();

    }
}
